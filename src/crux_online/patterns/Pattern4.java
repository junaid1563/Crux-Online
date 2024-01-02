package crux_online.patterns;

import java.util.Scanner;

public class Pattern4 {

//	n=5
//	       *
//	     * *
//	   * * *
//	 * * * *
// * * * * *
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		approach2(n);
		System.out.println();

		int row = 1;
		while (row <= n) {
			// row work
			int nst = row;
			int nsp = n - row ;
			int col = 1;
			while (col <= nsp) {
//				for space
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
//				for stars
				System.out.print("*");
				col++;
			}
			// prep
			row = row + 1;
			System.out.println();
		}

	}

	public static void approach2(int n) {
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while (row <= n) {
			// row work
			int col = 1;
			while (col <= nsp) {
//				for space
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			// prep
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 1;
			System.out.println();
		}
	}

}
