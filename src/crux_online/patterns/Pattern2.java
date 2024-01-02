package crux_online.patterns;

import java.util.Scanner;

public class Pattern2 {
//	n=5
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		int row = 1;
		while (row <= n) {
			// row work
			int col = 1;
			while (col <= row) {
				System.out.print("* ");
				col = col + 1;
			}
			// prep
			row = row + 1;
			System.out.println();
		}
	}

}
