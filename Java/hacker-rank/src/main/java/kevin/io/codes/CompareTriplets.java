package kevin.io.codes;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public List<Integer> compare(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                bPoints++;
            } else if (a.get(i) > b.get(i)) {
                aPoints++;
            }
        }

        return Arrays.asList(aPoints, bPoints);
    }
}
