package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
    1
   123
  12345
 1234567
123456789 

 */

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = 1, nsp = n - 1;
		while (row <= n) {
			int val = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val+"\t");
				val++;
				cst++;
			}

			// prep work
			nst += 2;
			nsp--;
			row++;
			System.out.println();
		}

	}
}
