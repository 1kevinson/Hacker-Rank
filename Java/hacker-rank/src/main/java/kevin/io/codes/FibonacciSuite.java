package kevin.io.codes;

import java.util.ArrayList;
import java.util.List;

/**
 * Fibonacci Sequence
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 etc …
 */
public class FibonacciSuite {

    public String generateSequence(int sequenceLength) {
        List<Integer> fibonacciSuite = new ArrayList<>();
        fibonacciSuite.addAll(0, List.of(0, 1));

        if (isFirstNumberOfSequence(sequenceLength)) return fibonacciSuite.get(0).toString();
        if (isTheTwoPrimeNumbersOfSequence(sequenceLength, 2)) return fibonacciSuite.toString();

        if (sequenceLength > 2) {
            while (fibonacciSuite.size() < sequenceLength) {
                fibonacciSuite.add(fibonacciSuite.get(fibonacciSuite.size() - 2) + fibonacciSuite.get(fibonacciSuite.size() - 1));
            }
        }

        return fibonacciSuite.toString();

    }

    private boolean isTheTwoPrimeNumbersOfSequence(int sequenceLength, int i) {
        return sequenceLength == i;
    }

    private boolean isFirstNumberOfSequence(int sequenceLength) {
        return isTheTwoPrimeNumbersOfSequence(sequenceLength, 1);
    }
}
