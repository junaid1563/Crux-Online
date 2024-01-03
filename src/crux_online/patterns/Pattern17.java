package crux_online.patterns;

import java.util.Scanner;

public class Pattern17 {

//	n = 7(odd)
//	*** *** 
//	**   **
//	*     *
//	       
//	*     *
//	**   **
//	*** ***

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
//		evenPattern(n);
		int row = 1;
		int nsp = 1;

		while (row <= n) {

			int nst = (n - nsp) / 2;

			// row work
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
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// prep
			if (row <= n / 2) {
				nsp = nsp + 2;
			} else {
				nsp = nsp - 2;
			}
			row = row + 1;
			System.out.println();

		}
	}
	
//	n=10(even)
//	**** ****
//	***   ***
//	**     **
//	*       *
//	         
//	         
//	*       *
//	**     **
//	***   ***
//	**** ****

	public static void evenPattern(int n) {
		// n is even
		int row = 1;
		int nsp = 1;

		while (row <= n) {

			int nst = (n - nsp) / 2;

			// row work
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
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// prep
			if (row < n / 2) {
				nsp = nsp + 2;
			} else if (n % 2 == 0 && row == n / 2) {
				nsp = nsp;
			} else {
				nsp = nsp - 2;
			}
			row = row + 1;
			System.out.println();

		}

	}
}