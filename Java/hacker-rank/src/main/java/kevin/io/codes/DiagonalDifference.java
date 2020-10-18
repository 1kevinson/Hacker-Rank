package kevin.io.codes;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int getTheDiagonalDifference(List<List<Integer>> array) {

        final var primaryDiagonal = new ArrayList<Integer>();
        final var secondaryDiagonal = new ArrayList<Integer>();

        var arraySize = array.size();

        for (int i = 0; i < arraySize; i++) {
            primaryDiagonal.add(array.get(i).get(i));
            for (int j = arraySize - 1; j >= 0; j--) {
                if ((i + j) == (arraySize - 1)) {
                    secondaryDiagonal.add(array.get(i).get(j));
                }
            }
        }

        final var operationResult = primaryDiagonal.stream().reduce(0, Integer::sum) - secondaryDiagonal.stream().reduce(0, Integer::sum);
        return Math.abs(operationResult);
    }


}
