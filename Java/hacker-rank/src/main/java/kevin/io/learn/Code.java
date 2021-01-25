package kevin.io.learn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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

        System.out.println("\n" + Bike.factorial(5));
        System.out.println(Pattern.matches("[a-z&&[^bc]]+", "lmslddf"));
    }
}

/**
 * This class is designed for test
 **/
class Bike {

    private static int count = 1;
    static int[][] arr = new int[3][3];

    public Bike() {
        System.out.println("constructor invoked" + count++);
    }

    static int factorial(int n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

}

class Outer {

    private final List<String> users = new ArrayList<>();

    private class StaticNested implements Database.MySQL {

        {
            users.add("Arsene");
            users.add("Georges");
            users.add("Larissa");
        }

        private void run() {
            this.insert("Paul");
            this.insert("Arsene");
            this.delete(1);
            System.out.println(users);
        }

        @Override
        public void insert(String name) {
            if (!users.contains(name)) users.add(name);
        }

        @Override
        public void delete(int id) {
            if (users.get(id) != null) users.remove(id);
        }
    }

    /**
     * Databases interfaces
     */
    interface Database {

        interface Mongo {

        }

        interface MySQL {
            void insert(String name);

            void delete(int id);
        }
    }

    @Test
    void testNestedClass() {
        final Outer.StaticNested nested = new Outer.StaticNested();
        nested.run();
    }
}