package kevin.io.codes.hacker.gene;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    private int actualAnswer;
    private Gene gene;

    @Given("The doctor receive a bear {string} gene")
    public void the_doctor_receive_a_bear_gene(String geneSequence) {
        this.gene = new Gene(geneSequence);
    }

    @When("performs an ajustement to fix it to steady")
    public void performs_an_ajustement_to_fix_it_to_steady() throws Exception {
        final GeneManager manager = new GeneManager();
        actualAnswer = manager.findTheSmallestPossibleStringToModify(gene);
    }

    @Then("get the minimal sub-string to change is {int}")
    public void get_the_minimal_sub_string_to_change_is(Integer int1) {
        Assertions.assertEquals(2, actualAnswer);
    }

}
