package kevin.io.learn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseInteger {

    public static int go(int number) {

        if (number == 0) return 0;

        int numberTemp;
        numberTemp = number < 0 ? Math.abs(number) : number;

        final String[] stringSpliced = String.valueOf(numberTemp).split("");
        // Create variable list from array
        final List<String> stringList = new ArrayList<>(Arrays.asList(stringSpliced));

        if (stringList.get(stringList.size() - 1).equals("0")) {
            stringList.remove(stringList.size() - 1);
        }

        Collections.reverse(stringList);

        final String reversedString = stringList.stream().reduce("", String::concat);

        return number < 0 ? -1 * Integer.parseInt(reversedString) : Integer.parseInt(reversedString);
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
}