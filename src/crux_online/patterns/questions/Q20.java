package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 11

          * 
        *   * 
      *       * 
    *           * 
  *               * 
*                   * 
  *               * 
    *           * 
      *       * 
        *   * 
          * 


 */

public class Q20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, fst = 1, fsp = n / 2, sst = 1, ssp = -1;
		while (row <= n) {

			int csp = 1;
			while (csp <= fsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while (cst <= fst) {
				System.out.print("* ");
				cst++;
			}

			csp = 1;
			while (csp <= ssp) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			if (row == n || row == 1) {
				cst = 2;
			}
			while (cst <= sst) {
				System.out.print("* ");
				cst++;
			}

			// prep work
			if (row <= n / 2) {
				fsp--;
				ssp += 2;
			} else {
				fsp++;
				ssp -= 2;
			}
			row++;
			System.out.println();
		}

	}
}
