package crux_online.patterns.questions;

import java.util.Scanner;

/* 
n = 5
         0
        909
       89098
      7890987
     678909876
    56789098765
   4567890987654
  345678909876543
 23456789098765432
1234567890987654321


 */

public class Q33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println();
		int row = 1, nst = 1, nsp = n - 1;
		while (row <= n) {
			int val = n - row + 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == (nst + 1) / 2 || row == 0) {
					System.out.print("0");
				} else {
					System.out.print(val);
				}
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}

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
