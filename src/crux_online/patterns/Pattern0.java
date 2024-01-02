package crux_online.patterns;

import java.util.Scanner;

public class Pattern0 {
	
//	n=5
//	*
//	*
//	*
//	*
//	*

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("*");
		}
	}

}
