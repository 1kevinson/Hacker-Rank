package kevin.io.codes.tests;

import kevin.io.codes.CompareTriplets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyListOf;

@DisplayName("Test comparison of ArrayList")
public class CompareTripletsTest {

    @Test
    @DisplayName("Verify that we have a return of 2 elements")
    public void verifyThatWeReturn2Elements() {
        CompareTriplets compareTriplets = new CompareTriplets();

        List<Integer> actualList = compareTriplets.compare(anyListOf(Integer.class), anyListOf(Integer.class));

        assertEquals(2, actualList.size());
    }

    @Test
    @DisplayName("Verify that we have the correct result")
    public void verifyThatWeGetTheCorrectResult() {
        CompareTriplets compareTriplets = new CompareTriplets();

        List<Integer> actualList1 = compareTriplets.compare(Arrays.asList(2, 3, 4), Arrays.asList(4, 3, 6));
        List<Integer> actualList2 = compareTriplets.compare(Arrays.asList(1, 3, 2), Arrays.asList(0, 2, 6));

        assertEquals(Arrays.asList(0, 2), actualList1);
        assertEquals(Arrays.asList(2, 1), actualList2);
    }
}
