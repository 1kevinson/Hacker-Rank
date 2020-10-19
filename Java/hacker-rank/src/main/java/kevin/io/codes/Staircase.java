package kevin.io.codes;

public class Staircase {

    static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// Think of 2D Array

//         1 2 3 4
//      1 [ , , ,#]
//      2 [ , ,#,#]
//      3 [ ,#,#,#]
//      4 [#,#,#,#]