package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
5	4	3	2	*	
5	4	3	*	1	
5	4	*	2	1	
5	*	3	2	1	
*	4	3	2	1

 */

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = n, star = n;
		while (row <= n) {
			int val = n;
			int cst = 1;
			while (cst <= nst) {

				if (cst != star) {
					System.out.print(val + "\t");
				} else {
					System.out.print("*" + "\t");
				}
				val--;
				cst++;
			}

			// prep work
			row++;
			star--;
			System.out.println();
		}

	}
}
