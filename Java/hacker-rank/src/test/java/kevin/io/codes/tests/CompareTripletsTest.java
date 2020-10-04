package kevin.io.codes.tests;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyListOf;

public class CompareTripletsTest {

    @Test
    void verifyThatWeReturn2Elements() {
        CompareTriplets compareTriplets = new CompareTriplets();

        List<Integer> actualList = compareTriplets.compare(anyListOf(Integer.class), anyListOf(Integer.class));

        assertEquals(2, actualList.size());
    }

    @Test
    void verifyThatWeGetTheCorrectResult() {
        CompareTriplets compareTriplets = new CompareTriplets();

        List<Integer> actualList = compareTriplets.compare(Arrays.asList(2, 3, 4), Arrays.asList(4, 3, 6));

        assertEquals(Arrays.asList(0, 2), actualList);
    }
}
