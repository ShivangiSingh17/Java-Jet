import java.util.Scanner;

public class AmstrongNumber {

  public static void main(String[] arg) {
    Scanner s = new Scanner( System.in );
    System.out.println("Enter a number");
    int num = s.nextInt();
    if(checkifAmstrongNumber(num)) {
      System.out.println("Entered number " + num + " is an Amstrong Number");
    } else {
      System.out.println("Entered number " + num + " is not an Amstrong Number");
    }
  }
  private static boolean checkifAmstrongNumber(int num) {
    int d, sum=0;
    while(num>0) {
      d = num % 10;
      num /= 10;
      sum += d * d * d;
    }
    if(num == sum)
      return true;
    return false;
  }
}
