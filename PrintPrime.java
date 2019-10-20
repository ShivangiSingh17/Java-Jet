import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The intention of this class is to perform following operations
 * 
 * 1. Take any number from 1-100 as Input from Console 2. Find if Input number
 * is a Prime number 3. If Prime, print two numbers as Output where the sum of
 * these two numbers will result in Input number
 *
 */
public class PrintPrime {

	public static void main(String[] args) throws IOException {
		readAndPrint();
	}

	private static void readAndPrint() throws IOException {
		System.out.println("Enter any number between 1-100 in Console:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int number = Integer.parseInt(input);
		System.out.println("Input Number: " + number);
		processNumber(number);
	}

	private static void processNumber(int num) {
		if (!isPrimeNumber(num)) {
			return;
		}

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (i < j && i + j == num) {
					System.out.println(num + " is Sum of " + i + " and " + j);
				}
			}
		}
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
