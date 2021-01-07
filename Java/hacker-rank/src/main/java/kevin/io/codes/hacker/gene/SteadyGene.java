package kevin.io.codes.hacker.gene;

public class SteadyGene {

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

interface GeneVerification {

    boolean checkGeneStringValidity(String geneString);

    boolean checkGeneLengthValidity(String geneString);

    boolean isGeneSteady(String geneString);
}

interface GeneModification {

    int findTheSmallestPossibleStringToModify();
}

class GeneManager implements GeneVerification,GeneModification {

    @Override
    public boolean checkGeneStringValidity(String geneString) {
        return false;
    }

    @Override
    public boolean checkGeneLengthValidity(String geneString) {
        return false;
    }

    @Override
    public boolean isGeneSteady(String geneString) {
        return false;
    }

    @Override
    public int findTheSmallestPossibleStringToModify() {
        return 0;
    }
}