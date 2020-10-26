package kevin.io.codes;

import kevin.io.codes.exceptions.NotInBoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

@DisplayName("Min - Max sum")
public class MinMaxSumTest {

    private MinMaxSum minMaxSum;

    @ParameterizedTest
    void shouldThrowAnErrorIfNumberInArrayIsOutOfBound(int... numbers){
     // Arrange

     // Act

     // Assert
        Assertions.assertThrows(NotInBoundException.class,()-> minMaxSum.calculateMinMaxSum(numbers));
    }

    @Test
    void shouldRenderTheMixMaxSumOfGivenArray(){}
}
