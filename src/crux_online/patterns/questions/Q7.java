package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5

 */
public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n - 2;

        while (row <= n) {
            if (row == 1 || row == n) {
                nsp = 0;
                nst = n / 2;
            } else {
                nsp = n - 2;
                nst = 1;
            }
            //row work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*\t");
                cst++;
            }
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }

            cst = 1;
            if (row == 1 || row == n) {
                cst = 0;
            }

            while (cst <= nst) {
                System.out.print("*\t");
                cst++;
            }
            //prep work
            row++;
            System.out.println();
        }
    }
}
