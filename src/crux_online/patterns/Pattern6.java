package crux_online.patterns;

import java.util.Scanner;

public class Pattern6 {

//	n = 5
//	*
//	* *
//	* * *
//	* * * * 
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		// rows
		int rows = n * 2 - 1;
		int row = 1;
		while (row <= rows) {
			// row work
			int nst = 0;
			if (row <= rows / 2) {
				nst = row;
			} else {
				nst = rows - row + 1;
			}
			int col = 1;
			while (col <= nst) {
				System.out.print("* ");
				col = col + 1;
			}

			// prep
			System.out.println();
			row = row + 1;
		}
		System.out.println();
		System.out.println("-------------------Approach 2-------------------");
		System.out.println();
		approach2(n);

	}

	public static void approach2(int n) {
		int rows = n * 2 - 1;
		int row = 1;
		int nst = 1;

		while (row <= rows) {
			// row work
			int col = 1;
			while (col <= nst) {
				System.out.print("* ");
				col++;
			}
			// prep

			if (row <= rows / 2) {
				nst = nst + 1;
			} else {
				nst = nst - 1;
			}
			row = row + 1;
			System.out.println();
		}
	}

}
