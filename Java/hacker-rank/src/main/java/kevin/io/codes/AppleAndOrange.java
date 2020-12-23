package kevin.io.codes;

import kevin.io.codes.exceptions.NotInBoundException;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) throws NotInBoundException {
        if (!isMatchedParameterConstraint(s, t, a, b)) {
            throw new NotInBoundException("Not matched Parameter constraint");
        }

        final var applesLanded = getAppleDistanceToTheTree(a, apples);
        final var orangesLanded = getOrangeDistanceToTheTree(a, oranges);

        return getTotalAppleAndOrangeLanded(s, t, applesLanded, orangesLanded);
    }

    public static boolean isMatchedParameterConstraint(int s, int t, int a, int b) {
        return a < s && s < t && t < b;
    }

    public static List<Integer> getAppleDistanceToTheTree(int treeLocation, int[] fruitDistances) {
        final List<Integer> appleDistances = new ArrayList<>();

        for (int distance : fruitDistances) {
            appleDistances.add(distance + treeLocation);
        }

        return appleDistances;
    }

    public static List<Integer> getOrangeDistanceToTheTree(int treeLocation, int[] fruitDistances) {
        final List<Integer> orangeDistances = new ArrayList<>();

        for (int distance : fruitDistances) {
            orangeDistances.add(distance + treeLocation);
        }

        return orangeDistances;
    }

    public static int[] getTotalAppleAndOrangeLanded(int homeStart, int homeEnd, List<Integer> apples, List<Integer> oranges) {
        final var totalApples = apples.stream()
                .filter(x -> homeStart <= x && x <= homeEnd)
                .map(e -> 1)
                .reduce(0, Integer::sum);

        final var totalOranges = oranges.stream()
                .filter(y -> homeStart <= y && y <= homeEnd)
                .map(e -> 1)
                .reduce(0, Integer::sum);

        return new int[]{totalApples, totalOranges};
    }
}
