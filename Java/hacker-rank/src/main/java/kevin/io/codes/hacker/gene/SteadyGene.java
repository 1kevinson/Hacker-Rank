package kevin.io.codes.hacker.gene;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface GeneVerification {

    boolean checkGeneStringValidity(String geneString);

    boolean checkGeneLengthValidity(String geneString);

    boolean isGeneSteady(String geneString);

}

interface GeneModification {

    int findTheSmallestPossibleStringToModify(Gene gene) throws Exception;

}

class Gene {

    private final String sequence;

    Gene(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }
}

class GeneManager implements GeneVerification, GeneModification {

    @Override
    public int findTheSmallestPossibleStringToModify(Gene gene) throws Exception {
        if(!isLengthAndStringSequenceAreValid(gene.getSequence()))
            throw new Exception("The gene sequence is not valid");

        if (isGeneSteady(gene.getSequence())) return 0;

        return 5;
    }

    @Override
    public boolean checkGeneStringValidity(String geneString) {
        final var splicedSequence = geneString.split("");

        for (String character : splicedSequence)
            if (!"ATCG".contains(character)) return false;

        return true;
    }

    @Override
    public boolean checkGeneLengthValidity(String geneString) {
        return geneString.length() >= 4 && geneString.length() <= 500000 && geneString.length() % 4 == 0;
    }

    @Override
    public boolean isGeneSteady(String geneString) {
        if (!isLengthAndStringSequenceAreValid(geneString)) return false;

        final int timeLetterOccurs = geneString.length() / 4;
        final List<Integer> occurrences = getOccurrences(geneString);

        return occurrences.stream().allMatch(x -> x == timeLetterOccurs);
    }

    private List<Integer> getOccurrences(String geneString) {
        final List<Integer> occurrences = new ArrayList<>();

        for (String character : new String[]{"T", "C", "A", "G"}) {
            final int counter = (int) Arrays.stream(geneString.split(""))
                    .filter(x -> x.equals(character))
                    .count();

            occurrences.add(counter);
        }
        return occurrences;
    }

    public boolean isLengthAndStringSequenceAreValid(String geneString) {
        return checkGeneStringValidity(geneString) && checkGeneLengthValidity(geneString);
    }
}