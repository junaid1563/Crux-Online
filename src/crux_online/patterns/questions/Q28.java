package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
     	 	 	1	
 	 	 	1	2	1	
 	 	1	2	3	2	1	
 	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1	


 */

public class Q28 {

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
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}

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
