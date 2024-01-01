package crux_online.basics;

public class Loops {

	public static void main(String[] args) {

		int counter = 1;

		while (counter <= 5) {
			System.out.println("Inside while loop" + counter);
			counter++;
		}

		counter = 1;
		do {
			System.out.println("Inside do-while loop" + counter);
			counter++;
		} while (counter <= 5);

		counter = 1;

		for (; counter <= 5; counter++) {
			System.out.println("Inside for loop" + counter);
		}
	}

}
