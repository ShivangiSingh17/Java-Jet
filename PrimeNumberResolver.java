package test;

/**
 * check and show whether the number is prime or not
 */
public class PrimeNumberResolver {

	public static void main(String[] args) {
		resolve(3);
		resolve(4);
		resolve(11);
		resolve(62);
	}

	private static void resolve(int number) {

		boolean numberIsPrime = numberIsPrimeCheck(number);

		if (numberIsPrime) {
			System.out.println(number + " is prime number");
		} else {
			System.out.println(number + " is not prime number");
		}
	}

	private static boolean numberIsPrimeCheck(int n) {
		boolean numIsPrime = true;

		// Corner case
		if (n <= 1) {
			numIsPrime = false;
		} else {
			// Check from 2 to n-1
			for (int i = 2; i < n; i++)
				if (n % i == 0) {
					numIsPrime = false;
				}
		}
		return numIsPrime;
	}
}
