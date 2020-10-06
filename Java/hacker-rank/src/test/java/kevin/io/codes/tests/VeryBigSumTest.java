package kevin.io.codes.tests;

import kevin.io.codes.VeyBigSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeryBigSumTest {

    @Test
    @DisplayName("Verify the return of long")
    void verifyThatWeHaveTheGoodAnswer() {
        VeyBigSum veyBigSum = new VeyBigSum();
        int[] array = {2, 5, 6, 6};

        assertEquals(19L,veyBigSum.sum(array));
    }
}
