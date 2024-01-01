package crux_online.basics;

import java.util.*;

public class ElseifDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if (age <= 11) {
			System.out.println("child");
		} else if (age > 11 && age < 18) {
			System.out.println("teenager");
		} else if (age >= 18 && age < 60) {
			System.out.println("adult");
		} else if (age < 100) {
			System.out.println("old");
		} else if (age < 0) {
			System.out.println("How are you alive?");
		} else {
			System.out.println("Old enough");
		}
	}
}