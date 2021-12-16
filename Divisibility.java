import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program will check if an Input number is divisible by 7 or any other input number.
 *
 */
public class Divisibility {

	public static void main(String[] args) throws IOException {
		readAndPrint();
	}

	private static void readAndPrint() throws IOException {
		int divideBy = 7;
		int number = readNumber("Enter any number between 1-100 in Console:");
		checkDivisibility(number, divideBy);

		String decision = readValue("If you would you like to check divisibility of " + number
				+ "against a different number, enter \"Y\" ?");

		if ("Y".equalsIgnoreCase(decision)) {
			divideBy = readNumber("Enter any number between 1-100 to in Console:");
			checkDivisibility(number, divideBy);
		}
	}

	private static int readNumber(String message) throws IOException {
		return Integer.parseInt(readValue(message));
	}

	private static String readValue(String message) throws IOException {
		System.out.println(message);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		System.out.println("Input: " + input);
		return input;
	}

	private static void checkDivisibility(int number, int divideBy) {
		if (number % divideBy == 0) {
			System.out.println(number + " is divisible by " + divideBy);
		} else {
			System.out.println(number + " is not divisible by " + divideBy);
		}
	}
}
