package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5
                    *	*	*	*	*
                            *	*	*	*
                                    *	*	*
                                            *	*
                                                    *
*/
public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;

        while (row <= n) {

            //row work
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*\t");
                cst++;
            }
            //prep work
            nst--;
            nsp += 2;
            row++;
            System.out.println();
        }
    }
}
