package crux_online.patterns;

import java.util.Scanner;

public class Pattern5 {

//	n=5
//	*****
//	 ****
//	  ***
//	   **
//	    *
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		int row = 1;
		while (row <= n) {
			// row work
			int nst = n - row + 1;
			int nsp = row - 1;
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

		System.out.println();
		System.out.println("-------------------Approach 2-------------------");
		System.out.println();
		approach2(n);

	}

	public static void approach2(int n) {
		int row = 1;
		int nst = n;
		int nsp = 0;
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
			nsp = nsp + 1;
			nst = nst - 1;
			System.out.println();
		}
	}

}
