package crux_online.basics;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
//		 find reminder of divident and divisor, and then change divident with divisor
//		 and divisor with reminder. Repeat same process until reminder is 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int divident, divisor;
		if (a > b) {
			divident = a;
			divisor = b;
		} else {
			divident = b;
			divisor = a;
		}

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}

		System.out.println("HCF of " + a + " and " + b + " is = " + divisor);

	}

}
/*
 * HCF(12, 34) = 2
 * 
 * 34/12 %= 10
 * 
 * 12/10 %= 2
 * 
 * 10/2 %=0
 * 
 * -----------
 * 
 * HCF(7,15) =1
 * 
 * 15/7 %=1
 * 
 * 7/1 %=0
 * 
 * ------------
 * 
 * HCF(25,10) = 5
 * 
 * 25/10 %= 5
 * 
 * 10/5 %=0
 * 
 * -------------
 * 
 * HCF(12,21) = 3
 * 
 * 21/12 %= 9
 * 
 * 12/9 %= 3
 * 
 * 9/3 %= 0
 */
