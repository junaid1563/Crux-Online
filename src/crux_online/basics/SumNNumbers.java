package crux_online.basics;

import java.util.*;

public class SumNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum of " + n + " natural numbers is " + sum);
	}

}
