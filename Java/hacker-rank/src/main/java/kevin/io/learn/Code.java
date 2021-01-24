package kevin.io.learn;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        final Character[][] arrays = new Character[4][5];
        Arrays.stream(arrays).forEach(arrayRow -> Arrays.fill(arrayRow, '.'));

        arrays[2][3] = 'M';
        arrays[1][0] = 'V';
        arrays[2][1] = 'M';

        for (Character[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }

        new Bike().notify();
    }
}


class Bike {

    private static int count = 1;
    static int[][] arr = new int[3][3];

    public Bike() {
        System.out.println("constructor invoked" + count++);
    }


}