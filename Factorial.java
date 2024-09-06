package slideDeckChallenges;

public class Factorial {

	public static void main(String[] args) {
		
		int number = 5;
		int result = fact(number);
		
		System.out.println("Factorial of " + number + " is " + result);

	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			System.out.println(n);
			return n * fact(n - 1);
		}
	}

}
