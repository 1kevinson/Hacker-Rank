package kevin.io.codes;

public class FizzBuzz {

    public String generate(int minNumber, int maxNumber) {
        return checkNumbers(minNumber, maxNumber);
    }

    private String evaluateNumber(int number) {
        if (number % 15 == 0)
            return "FizzBuzz";
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";

        return String.valueOf(number);
    }

    private String checkNumbers(int minNumber, int maxNumber) {
        StringBuilder result = new StringBuilder(1000);

        while (minNumber < maxNumber) {
            result.append(evaluateNumber(minNumber++));
        }

        return result.append(evaluateNumber(maxNumber)).toString();
    }
}
