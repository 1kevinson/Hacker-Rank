package kevin.io.codes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.MethodOrderer.*;

@TestMethodOrder(OrderAnnotation.class)
class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    void init() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    @Order(1)
    @DisplayName("Should Return 1 if Number is 1")
    void shouldReturn1IfNumberIs1() {
        assertEquals("1", fizzbuzz.generate(1, 1));
    }

    @Test
    @Order(2)
    @DisplayName("Should Return 2 if Number is 2")
    void shouldReturn2IfNumberIs2() {
        assertEquals("2", fizzbuzz.generate(2, 2));
    }

    @Test
    @Order(3)
    @DisplayName("Should Return Fizz if Number is 3")
    void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", fizzbuzz.generate(3, 3));
    }

    @Test
    @Order(4)
    @DisplayName("Should Return Fizz if Number is 6")
    void shouldReturnFizzIfNumberIs6() {
        assertEquals("Fizz", fizzbuzz.generate(6, 6));
    }

    @Test
    @Order(5)
    @DisplayName("Should Return Buzz if Number is 5")
    void shouldReturnBuzzIfNumberIs5() {
        assertEquals("Buzz", fizzbuzz.generate(5, 5));
    }

    @Test
    @Order(6)
    @DisplayName("Should Return Buzz if Number is 10")
    void shouldReturnBuzzIfNumberIs10() {
        assertEquals("Buzz", fizzbuzz.generate(10, 10));
    }

    @Test
    @Order(7)
    @DisplayName("Should Return FizzBuzz if Number is 15")
    void shouldReturnFizzBuzzIfNumberIs15() {
        assertEquals("FizzBuzz", fizzbuzz.generate(15, 15));
    }

    @Test
    @Order(8)
    @DisplayName("Should Return FizzBuzz if Number is 30")
    void shouldReturnFizzBuzzIfNumberIs30() {
        assertEquals("FizzBuzz", fizzbuzz.generate(30, 30));
    }

    @Test
    @Order(9)
    @DisplayName("Should Return 12 if Number are 1 and 2")
    void shouldReturn12IfNumberAre1and2() {
        assertEquals("12", fizzbuzz.generate(1, 2));
    }

    @Test
    @Order(10)
    @DisplayName("Should Return 12Fizz if Number are 1 to 3")
    void shouldReturn12FizzIfNumberAre1nTo3() {
        assertEquals("12Fizz", fizzbuzz.generate(1, 3));
    }

    @Test
    @Order(11)
    @DisplayName("Should Return 12Fizz4Buzz if Number are 1 to 5")
    void shouldReturn12Fizz4BuzzIfNumberAre1nTo5() {
        assertEquals("12Fizz4Buzz", fizzbuzz.generate(1, 5));
    }

    @Test
    @Order(12)
    @DisplayName("Should Return Correct Sequence if Number are 1 to 5")
    void shouldReturnCorrectSequenceNumberAre1nTo15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", fizzbuzz.generate(1, 15));
    }
}