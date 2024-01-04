package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5
             *
            * *
           * * *
          * * * *
         * * * * *
 */

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1, nsp = n - 1, nst = 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                if (cst == nst) {
                    System.out.print("*");
                } else {
                    System.out.print("*" + " ");
                }
                cst++;
            }


            //prep work

            nst += 1;
            nsp -= 1;
            row++;
            System.out.println();
        }
    }
}
