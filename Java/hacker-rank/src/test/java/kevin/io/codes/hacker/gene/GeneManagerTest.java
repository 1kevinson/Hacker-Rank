package kevin.io.codes.hacker.gene;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GeneManagerTest {

    private final GeneManager geneManager = new GeneManager();
    private final String badSequenceShort = "TIBAJK";
    private final String badSequenceLong = "TCAGGCATAACCTTG";
    private final String goodSequenceShort = "TCAGGCAT";
    private final String goodSequenceLong = "TCAGGCATACTG";

    @Test
    @DisplayName("Should verify that we have only the 4 letters A|T|C|G in gene Sequence")
    void shouldVerifyTheStringComposeWith4Letters() {
        assertTrue(geneManager.checkGeneStringValidity(goodSequenceShort));
        assertFalse(geneManager.checkGeneStringValidity(badSequenceShort));
    }

    @Test
    @DisplayName("Should verify that the length of sequence is divisible by 4")
    void shouldVerifyTheLengthOfTheSequence() {
        assertTrue(geneManager.checkGeneLengthValidity(goodSequenceLong));
        assertFalse(geneManager.checkGeneLengthValidity(badSequenceShort));
    }

    @Test
    @DisplayName("Should verify that the length is divisible by 4 and string is is compose by A|T|C|G")
    void shouldVerifyTheSequenceLengthAndStringAreValid() {
        assertTrue(geneManager.isLengthAndStringSequenceAreValid(goodSequenceShort));
        assertFalse(geneManager.isLengthAndStringSequenceAreValid(badSequenceLong));
    }

    @Test
    @DisplayName("Should verify that the length of sequence is divisible by four")
    void shouldVerifyTheSequenceGeneIsSteady() {
        assertTrue(geneManager.isGeneSteady(goodSequenceLong));
        assertFalse(geneManager.isGeneSteady(badSequenceLong));
    }

    @ParameterizedTest
    @ValueSource(strings = {"A","C","G","T"})
    @DisplayName("Should verify that Gene character matches")
    void shouldMatchesGeneCharacter(String character) {
        assertTrue(geneManager.isGeneCharacterMatches(character));
    }

    @Test
    @DisplayName("Should give the smallest substring to fix the gene")
    void shouldGiveTheSmallestPossibleSubstring() throws Exception {
        final Gene sequence = new Gene("GAAATAAA");
        assertEquals(5, geneManager.findTheSmallestPossibleStringToModify(sequence));
    }

}