package kevin.io.codes;


import kevin.io.codes.exceptions.NotInBoundException;

import java.util.*;

public class MinMaxSum {

    public static String calculateMinMaxSum(int[] array) throws NotInBoundException {
        if (!isLengthEqualsFive(array)) {
            throw new NotInBoundException("The array length not fit to 5");
        }

        final List<Integer> sumArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            final int y = i;
            final int sum = Arrays.stream(array)
                    .filter(x -> x != array[y])
                    .reduce(0, Integer::sum);
            sumArray.add(sum);
        }

        Collections.sort(sumArray);
        return sumArray.get(0).toString().concat(" ").concat(sumArray.get(sumArray.size() - 1).toString());
    }

    private static boolean isLengthEqualsFive(int[] array) {
        return array.length == 5;
    }
}

