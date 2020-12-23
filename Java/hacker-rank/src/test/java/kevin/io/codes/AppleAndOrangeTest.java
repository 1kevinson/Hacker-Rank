package kevin.io.codes;

import kevin.io.codes.exceptions.NotInBoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

class AppleAndOrangeTest {

    @Test
    @DisplayName("Should be a < s < t < b parameter constraints")
    void shouldRespectParametersConstraints() {
        // Given | When
        final NotInBoundException exception = Assertions.assertThrows(NotInBoundException.class,
                () -> AppleAndOrange.countApplesAndOranges(
                        4, 1, anyInt(), anyInt(), any(), any())
        );

        // Then
        assertEquals(exception.getMessage(), "Not matched Parameter constraint");
    }

    @Test
    @DisplayName("Should return apple distance to the tree")
    void shouldReturnApplesDistanceToTheTree() {
        // Given
        final int treeLocation = 4;
        final int[] appleDistances = new int[]{2, -4, 10};

        // When
        final var actual = AppleAndOrange.getAppleDistanceToTheTree(treeLocation, appleDistances);

        // Then
        assertEquals(actual, List.of(6, 0, 14));
    }

    @Test
    @DisplayName("Should return orange distance to the tree")
    void shouldReturnOrangesDistanceToTheTree() {
        // Given
        final int treeLocation = 12;
        final int[] orangeDistances = new int[]{-5, -2, 7};

        // When
        final var actual = AppleAndOrange.getAppleDistanceToTheTree(treeLocation, orangeDistances);

        // Then
        assertEquals(actual, List.of(7, 10, 19));
    }

    @Test
    @DisplayName("Should return apple and orange landed in the house")
    void shouldReturnNumbersOfAppleAndOrangesLandToTheHouse() throws NotInBoundException {
        // Given
        final int appleTree = 4;
        final int homeStart = 7;
        final int homeEnd = 12;
        final int orangeTree = 17;

        // When
        final int[] actual = AppleAndOrange.countApplesAndOranges(homeStart, homeEnd, appleTree, orangeTree, new int[]{2, 5, -6, 6}, new int[]{-5, 6, 2, -8});

        // Then
        assertEquals(Arrays.toString(actual), Arrays.toString(new int[]{2, 1}));
    }

}
