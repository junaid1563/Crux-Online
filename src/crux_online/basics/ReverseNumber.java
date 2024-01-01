package crux_online.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int rem = 0, reverse = 0, multiplier = 10, num = n;
//		n= 12345, 
//		reverse = 5 -> 54(50+4) -> 543 (540+3)-> 5432(5430+2) -> 54321(54320+1)

		while (num != 0) {
			rem = num % 10;
			reverse = reverse * multiplier + rem;
			num = num / 10;
		}

		System.out.println("Reverse of " + n + " is " + reverse);

	}

}
