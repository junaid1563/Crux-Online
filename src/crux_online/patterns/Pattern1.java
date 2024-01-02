package crux_online.patterns;

import java.util.Scanner;

public class Pattern1 {
	
//	n=5
//	* * * * * 
//	* * * * * 
//	* * * * * 
//	* * * * * 
//	* * * * * 


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
