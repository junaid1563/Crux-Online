package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 11
*           *
**         **
***       ***
****     ****
*****   *****
****** ******
*************

   

 */

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = 1, nsp = 2 * n - 3;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			cst = 1;
			if (row == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep work
			nst++;
			nsp -= 2;
			row++;
			System.out.println();
		}

	}
}
