package kevin.io.codes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceTest {

    @Test
    @DisplayName("Verify that we have a diagonal sum of 2D array")
    void shouldGetTheDiagonalDifferenceOf2dArray() {
        // Arrange
        final var count = 3;
        List<List<Integer>> arrayTest = new ArrayList<>(count);

        for (int i = 0; i < count ; i++) {
            arrayTest.add(new ArrayList<>(count));
        }

        arrayTest.get(0).addAll(List.of(1,2,3));
        arrayTest.get(1).addAll(List.of(10,2,3));
        arrayTest.get(2).addAll(List.of(1,2,43));

        // Act
        final var actual = DiagonalDifference.getTheDiagonalDifference(arrayTest);

        // Assert
        Assertions.assertEquals(40,actual);
    }
}
