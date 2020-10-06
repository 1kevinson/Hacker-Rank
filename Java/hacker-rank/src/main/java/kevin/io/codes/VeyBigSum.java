package kevin.io.codes;

public class VeyBigSum {

    public Long sum(int[] array) {
        long sum = 0;
        for (int j : array) {
            sum += j;
        }

        return sum;
    }
}
