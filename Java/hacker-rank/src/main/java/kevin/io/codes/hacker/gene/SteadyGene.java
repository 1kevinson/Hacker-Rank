
package kevin.io.codes.hacker.gene;

public class SteadyGene {

}

interface GeneVerification {


    boolean checkGeneStringValidity(String geneString);

    boolean checkGeneLengthValidity(String geneString);
    boolean isGeneSteady(String geneString);

}
interface GeneModification {

    int findTheSmallestPossibleStringToModify(Gene gene);

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
    public int findTheSmallestPossibleStringToModify(Gene gene) {
        return 0;
    }

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
}