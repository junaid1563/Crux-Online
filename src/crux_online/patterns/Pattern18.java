package crux_online.patterns;

import java.util.Scanner;

public class Pattern18 {
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//	n=7

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		evenPattern(n);
		int row = 1;
		int nsp = n / 2;
		int nst = 1;

		while (row <= n) {

			// row work
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			// prep
			if (row <= n / 2) {
				nst = nst + 2;
				nsp--;
			} else {
				nst = nst - 2;
				nsp++;
			}
			row = row + 1;
			System.out.println();

		}
	}

//	n=6
//	   *
//	  ***
//	 *****
//	 *****
//	  ***
//	   *

	public static void evenPattern(int n) {
		// n is even
		int row = 1;
		int nsp = n / 2-1;
		int nst = 1;

		while (row <= n) {

			// row work
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			// prep
			if (row < n / 2) {
				nst = nst + 2;
				nsp--;
			} else if (n % 2 == 0 && row == n / 2 ) {
				nst = nst;
				nsp = nsp;
			} else {
				nst = nst - 2;
				nsp++;
			}
			row = row + 1;
			System.out.println();

		}
	}
}