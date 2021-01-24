package kevin.io.learn;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
    }
}


class Bike {

    private static int count = 1;

    public Bike() {
        System.out.println("constructor invoked" + count ++);
    }

    static {
        System.out.println("Instance initializer invoked");
    }
}