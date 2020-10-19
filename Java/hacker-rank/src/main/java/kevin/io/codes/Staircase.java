package kevin.io.codes;

public class Staircase {

    static void staircase(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if ((i + j) >= n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// Think of 2D Array (i+j) > n-1

//         0 1 2 3
//      0 [ , , ,#]
//      1 [ , ,#,#]
//      2 [ ,#,#,#]
//      3 [#,#,#,#]