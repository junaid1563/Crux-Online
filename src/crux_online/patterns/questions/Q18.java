package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 11
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 

 */

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int row = 1, nsp = n / 2, nst = 1;

		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// prep work
			if (row <= n / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			row++;
			System.out.println();
		}
	}
}
