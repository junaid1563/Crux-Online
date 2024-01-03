package crux_online.patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int row = 1;
		int nsp = n * 2 - 3;
		int nst = 1;

		while (row <= n) {

			// row work
			int col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			if (row == n) {
				col = 2;
			}
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			// prep
			nst++;
			nsp -= 2;
			row = row + 1;
			System.out.println();

		}

	}

}