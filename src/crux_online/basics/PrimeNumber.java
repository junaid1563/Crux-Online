package crux_online.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean isPrime = isPrime(n);

		if (isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	public static boolean isPrime(int n) {

		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
