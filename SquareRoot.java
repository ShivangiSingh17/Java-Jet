import java.util.Scanner;

public class SquareRoot {

    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int val = in.nextInt();

        //loops until user gives a valid number
        while (val <= 0) {
            System.out.println("Please enter a value greater than 0");
            val = in.nextInt();
        }
            double valCopy;

            double squareRoot = val / 2;

            valCopy = squareRoot;
            squareRoot = (valCopy + (val / valCopy)) / 2;

            // Uses a loop comparing our value to its root. The loop will become false when
            // square root next value is our inputted number
            while (true) {
                if ((valCopy - squareRoot) == 0) break;
                valCopy = squareRoot;
                squareRoot = (valCopy + (val / valCopy)) / 2;
            }

            System.out.printf("Square root of %d is %.1f", val, squareRoot);
    }

}
