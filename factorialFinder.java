public class factorialFinder {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please Input Your Number: ");
       int input = scan.nextInt();
       int output = factorial(input);
       System.out.println("The factorial of " + input + " is: " + output);
   }

   public static int factorial(int input) {
       int value = 1;
       for (int i = 1; i <= input; i++) {
           value = value * i;
       }
       return value;
   }
}
