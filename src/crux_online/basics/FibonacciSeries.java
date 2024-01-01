package crux_online.basics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int f1 = 0, f2 = 1;
		System.out.println("Fibonacci Series");
		System.out.print(f2 + " ");
		for (int i = 0; i < n - 1; i++) {
			int fi = f1 + f2;
			f1 = f2;
			f2 = fi;
			System.out.print(fi + " ");
		}

	}

}
