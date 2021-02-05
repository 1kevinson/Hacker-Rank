package kevin.io.learn;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseInteger {

    public static int go(int number) {

        if(!isFollowConstraint(number)) throw new NumberFormatException();

        String reversedString = new StringBuilder()
                .append(Math.abs(number))
                .reverse()
                .toString();


            return (number < 0) ? -1 * parseInt(reversedString) : parseInt(reversedString);

    }

    private static boolean isFollowConstraint(int number){
        return number >= -Math.pow(2,31) && number <= Math.pow(2,31);
    }

}

class ReverseTest {

    @Test
    void shouldReturn0() {
        assertEquals(0, ReverseInteger.go(0));
    }

    @Test
    void shouldReturnTheReverseOf1() {
        assertEquals(1, ReverseInteger.go(1));
    }

    @Test
    void shouldReturnTheReverseOf12() {
        assertEquals(21, ReverseInteger.go(12));
    }

    @Test
    void shouldReturnTheReverseOfNegative123() {
        assertEquals(-321, ReverseInteger.go(-123));
    }

    @Test
    void shouldReturnCorrectReverseForNumberWith0AtTheEnd() {
        assertEquals(54, ReverseInteger.go(450));
    }

    @Test
    void shouldVerifyTheConstraint() {
        assertThrows(NumberFormatException.class, () -> ReverseInteger.go((int) Math.pow(2, 40)));
    }


}