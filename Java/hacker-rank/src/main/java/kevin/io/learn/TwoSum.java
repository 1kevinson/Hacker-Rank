package kevin.io.learn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSum {

    public static int[] twoSumGenerate(int[] numbers, int target) {
        if (!isArraySizeBetween2and10exp3(numbers))
            throw new ArrayIndexOutOfBoundsException("Array size is not good");

        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target - numbers[j] == numbers[i]) {
                    result = new int[]{i, j};
                }
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static boolean isArraySizeBetween2and10exp3(int[] numbers) {
        return 2 <= numbers.length && Math.pow(10, 3) >= numbers.length;
    }

}


@DisplayName("Two Sum test codes")
class TwoSumTest {

    @Test
    @DisplayName("Should check that array size is correct")
    void shouldCheckThatArraySizeIsCorrect() {
        assertTrue(TwoSum.isArraySizeBetween2and10exp3(new int[]{1, 2}));
        assertFalse(TwoSum.isArraySizeBetween2and10exp3(new int[]{13}));
    }

    @Test
    @DisplayName("Should Throw an Exception ArrayIndexOutBound for Array Input")
    void shouldThrowExceptionDueToBadArraySize() {
        final ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> TwoSum.twoSumGenerate(new int[]{2}, 9));
        assertEquals(exception.getMessage(), "Array size is not good");
    }

    @Test
    @DisplayName("Should return [0, 1]")
    void shouldReturnCorrectResultFor2ArrayElements() {
        final int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSum.twoSumGenerate(new int[]{2, 5}, 7));
    }

    @Test
    @DisplayName("Should return [1,3]")
    void shouldReturnCorrectResultFor4ArrayElements() {
        final int[] expected = {1, 3};
        assertArrayEquals(expected, TwoSum.twoSumGenerate(new int[]{66, 7, 15, 2}, 9));
    }

    @Test
    @DisplayName("Should return [4,6]")
    void shouldReturnCorrectResultForMoreArrayElements() {
        final int[] expected = {4, 6};
        assertArrayEquals(expected, TwoSum.twoSumGenerate(new int[]{66, 22, 4, 75, 3, 6, 14, 52, 7, 151, 2}, 17));
    }

}