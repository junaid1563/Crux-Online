package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
 	 	 	 	1	
 	 	 	2	0	2	
 	 	3	0	0	0	3	
 	4	0	0	0	0	0	4	
5	0	0	0	0	0	0	0	5	

 */

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = 1, nsp = n - 1;
		while (row <= n) {
			int val = row;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {

				if (cst == 1 || cst == nst) {
					System.out.print(val + "\t");
				} else {
					System.out.print("0" + "\t");
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
