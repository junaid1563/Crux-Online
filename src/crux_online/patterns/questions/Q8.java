package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5
                *   *
                 * *
                  *
                 * *
                *   *
*/

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1, fsp = 0, ssp = n - 2, nst = 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= fsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }

            csp = 1;
            while (csp <= ssp) {
                System.out.print("  ");
                csp++;
            }

            cst = 1;
            if (row == (n + 1) / 2) {
                cst = 2;
            }
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            //prep work

            if (row <= n / 2) {
                fsp++;
                ssp -= 2;
            } else {
                fsp--;
                ssp += 2;
            }
            row++;
            System.out.println();
        }
    }
}
