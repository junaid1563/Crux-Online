package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1


 */

public class Q32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = 1, rows = 2 * n - 1;
		while (row <= rows) {
			int val = row;
			if (row > rows / 2) {
				val = rows - row + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);
				}
				cst++;
			}

			// prep work
			if (row <= rows / 2) {
				nst += 2;
			} else {
				nst -= 2;
			}
			row++;
			System.out.println();
		}

	}
}
