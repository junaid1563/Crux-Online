package crux_online.patterns.questions;

import java.util.Scanner;

/* n=5
*****
  ****
    ***
	  **
	    *
      **
	***
  ****
*****

 */

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int row = 1, rows = 2 * n - 1, nsp = 0, nst = n;

		while (row <= rows) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}

			// prep work
			if (row <= rows / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			row++;
			System.out.println();
		}
	}
}
