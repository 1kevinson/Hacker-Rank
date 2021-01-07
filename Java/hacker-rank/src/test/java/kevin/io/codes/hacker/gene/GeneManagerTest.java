package kevin.io.codes.hacker.gene;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneManagerTest {

    private final GeneManager geneManager = new GeneManager();
    private final String badSequence = "TIBAJK";
    private final String goodSequence = "TCAGGCAT";

    @Test
    @DisplayName("Should verify that we have only the 4 letters A|T|C|G in gene Sequence")
    void shouldVerifyTheStringComposeWith4Letters() {
        assertTrue(geneManager.checkGeneStringValidity("ATTA"));
        assertTrue(geneManager.checkGeneStringValidity(goodSequence));
        assertFalse(geneManager.checkGeneStringValidity(badSequence));
    }

    @Test
    @DisplayName("Should verify that the length of sequence is divisible by 4")
    void shouldVerifyTheLengthOfTheSequence() {
        assertTrue(geneManager.checkGeneStringValidity("ACCC"));
        assertTrue(geneManager.checkGeneLengthValidity(goodSequence));
        assertFalse(geneManager.checkGeneLengthValidity(badSequence));
    }

    @Test
    @DisplayName("Should verify that the length is divisible by 4 and string is is compose by A|T|C|G")
    void shouldVerifyTheSequenceLengthAndStringAreValid() {
        assertTrue(geneManager.isLengthAndStringSequenceAreValid("GAAATAAA"));
        assertTrue(geneManager.isLengthAndStringSequenceAreValid(goodSequence));
        assertFalse(geneManager.isLengthAndStringSequenceAreValid(badSequence));
    }

    @Test
    @DisplayName("Should verify that the length of sequence is divisible by four")
    void shouldVerifyTheSequenceGeneIsSteady() {
        assertTrue(geneManager.isGeneSteady("TCAGGCAT"));
        assertTrue(geneManager.isGeneSteady("TCAGGCATACTG"));
        assertFalse(geneManager.isGeneSteady("TCAGGCATAACCTTG"));

    }

    @Test
    @DisplayName("Should give the smallest substring to fix the gene")
    void shouldGiveTheSmallestPossibleSubstring() throws Exception {
        final Gene sequence = new Gene("GAAATAAA");
        assertEquals(5, geneManager.findTheSmallestPossibleStringToModify(sequence));
    }

}