import java.util.Scanner;

public class LeapYear {

    // Driver Method
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        int year = Integer.MIN_VALUE;

        System.out.print("Enter the Year (YYYY) : ");

        // User Input
        year = scan.nextInt();

        // leap year logic
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Input Year " + year + " is Leap Year!");
        } else {
            System.err.println("Input Year " + year + " is NOT a Leap Year!");
        }
    }
}