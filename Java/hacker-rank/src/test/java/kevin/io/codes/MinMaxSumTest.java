package kevin.io.codes;

import kevin.io.codes.exceptions.NotInBoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Calculate the Min Max Of a Given Array")
public class MinMaxSumTest {

    @Test
    @DisplayName("Throw an Error If the array is not fit 5 elements")
    void shouldThrowAnErrorIfNumberOfArrayElementsIsOutOfBound() {
        // Given & When
        final int[] arrayOfTest = new int[6];

        // Then
        assertThrows(NotInBoundException.class, () -> MinMaxSum.calculateMinMaxSum(arrayOfTest));
    }

    @Test
    @DisplayName("Display the Min Max Sum")
    void shouldRenderTheMixMaxSumOfGivenArray() throws NotInBoundException {
        // Given
        final int[] arrayOfTest = new int[]{1, 2, 3, 4, 5};

        // When
        final String expected = MinMaxSum.calculateMinMaxSum(arrayOfTest);

        // Then
        assertEquals("10 14", expected);
    }
}
