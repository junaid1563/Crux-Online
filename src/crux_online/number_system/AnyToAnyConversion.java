package crux_online.number_system;

import java.util.Scanner;

public class AnyToAnyConversion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter current base");
		int currentBase = scn.nextInt();
		System.out.println("enter target base");
		int targetBase = scn.nextInt();
		System.out.println("Please enter a number");
		long n = scn.nextLong();
		System.out.println("Decimal of " + n + " is " + anyToAny(n, targetBase, currentBase));

	}

	/*
	 * this method can do any type of number system conversion input arg1 - number,
	 * arg2- target base, arg3 - current base
	 */
	public static long anyToAny(long number, int targetBase, int currentBase) {
		long num = 0, divident = number, x = 0;
		while (divident != 0) {
			long rem = divident % targetBase;
			divident = divident / targetBase;
			num += rem * Math.pow(currentBase, x);
			x++;
		}
		return num;
	}

}
