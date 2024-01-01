package crux_online.basics;

public class SimpleInterest {
	public static void main(String[] args) {
		double principal = 1000.20;
		double rate = 10.20;
		int time = 2;

		System.out.println("Simple interest in " + time + " years is " + (principal * time * rate / 100));
	}
}