package crux_online.patterns;

import java.util.Scanner;

public class Pattern3 {

//	n=5
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		approach2(n);
		System.out.println();

		int row = 1;
		while (row <= n) {
			// row work
			int nst = n - row + 1;
			int col = 1;
			while (col <= nst) {
				System.out.print("* ");
				col++;
			}
			// prep
			row = row + 1;
			System.out.println();
		}

	}

	public static void approach2(int n) {
		int row = 1;
		int nst = n;
		while (row <= n) {
			// row work
			int col = 1;
			while (col <= nst) {
				System.out.print("* ");
				col++;
			}
			// prep
			row = row + 1;
			nst = nst - 1;
			System.out.println();
		}
	}

}
