package crux_online.patterns;

import java.util.Scanner;

public class Pattern23 {
	
//    1
//   111
//  11111
// 1111111
//111111111
//
//n=5

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int val=1;

		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				cst++;
			}
			// prep work

			nsp--;
			nst += 2;
			row++;
			System.out.println();
		}

	}

}
