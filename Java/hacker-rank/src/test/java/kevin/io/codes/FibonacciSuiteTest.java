package kevin.io.codes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSuiteTest {

    private FibonacciSuite fibonacci;

    @BeforeEach
    void setup(){
        fibonacci = new FibonacciSuite();
    }

    @Test
    @DisplayName("Should Return 0 for the prime number of sequence")
    void shouldReturn0forThePrimeNumberOfFibonacciSequence() {
        assertEquals("0", fibonacci.generateSequence(1));
    }

    @Test
    @DisplayName("Should Return [0, 1] for the beginning of sequence")
    void shouldReturn0and1forTheStartOfFibonacciSequence() {
        assertEquals("[0, 1]", fibonacci.generateSequence(2));
    }


    @Test
    @DisplayName("Should Return [0, 1, 1] for sequenceLength is 3")
    void shouldReturnCorrectFibonacciSequenceFor3() {
        assertEquals("[0, 1, 1]", fibonacci.generateSequence(3));
    }

    @Test
    @DisplayName("Should Return [0, 1, 1, 2] for sequenceLength is 4")
    void shouldReturnCorrectFibonacciSequenceFor4() {
        assertEquals("[0, 1, 1, 2]", fibonacci.generateSequence(4));
    }

    @Test
    @DisplayName("Should Return [0, 1, 1, 2, 3, 5, 8, 13] for sequenceLength is 8")
    void shouldReturnCorrectFibonacciSequenceFor8() {
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13]", fibonacci.generateSequence(8));
    }
}