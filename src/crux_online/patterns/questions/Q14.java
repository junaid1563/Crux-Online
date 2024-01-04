package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

 */

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1, rows = 2 * n - 1, nsp = n - 1, nst = 1;

        while (row <= rows) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }


            //prep work
            if (row <= rows / 2) {
                nst++;
                nsp--;
            } else {
                nst--;
                nsp++;
            }
            row++;
            System.out.println();
        }
    }
}
