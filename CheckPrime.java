import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program will check if an Input number is a Prime number
 * 
 */
public class CheckPrime {

	public static void main(String[] args) throws IOException {
		checkNumber();
	}

	private static void checkNumber() throws IOException {
		System.out.println("Enter any number between 1-100 in Console:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int number = Integer.parseInt(input);
		System.out.println("Input Number: " + number);
		isPrimeNumber(number);
	}

	private static boolean isPrimeNumber(int num) {
		if (0 == num || 1 == num) {
			return false;
		}

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				System.out.println(num + " is not a Prime Number");
				return false;
			}
		}
		System.out.println(num + " is a Prime number");
		return true;
	}
}
