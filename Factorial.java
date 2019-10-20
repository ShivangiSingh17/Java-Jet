import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger x;

    static BigInteger factorial(int n) {
        if(n == 0)
            return BigInteger.valueOf(1);

        else{    
            for(n = n - 1; n > 1; n--)
                x = x.multiply(BigInteger.valueOf(n));

            return x;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a whole number to display its factorial: ");
        int n = scanner.nextInt();
        x = new BigInteger(Integer.toString(n));

        System.out.println("Factorial of " + n + " is: " + factorial(n));
        
        scanner.close();
    }
}