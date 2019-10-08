import java.util.Scanner;

/**
 * Factorial class implemets a method that takes a number from console and
 * prints the factorial of the introduced number.
 * 
 * @author Iulian Vasile Baba
 */

class Factorial {
    public static void main(String args[]) {

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact + i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

    }
}