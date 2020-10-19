package kevin.io.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StaircaseTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outputStream);
    private PrintStream originalOut;

    @BeforeEach
    void setup() {
        originalOut = System.out;
        System.setOut(printStream);
    }

    @Test
    void shouldPrintStairs() {
        // Arrange
        final var stairNumber = 4;
        final var expected = String.join(System.lineSeparator(),
                "   #",
                "  ##",
                " ###",
                "####",
                "");

        // Act
        Staircase.staircase(stairNumber);

        // Assert
        Assertions.assertEquals(expected, outputStream.toString());
    }

    @AfterEach
    void teardown() {
        System.setOut(originalOut);
    }

}
