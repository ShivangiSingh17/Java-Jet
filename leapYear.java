
import java.util.Scanner;

public class Main {

public static void main(String[] args){

    int year;

    System.out.println("Enter a year to check if it is a leap year or not:");
    Scanner scan = new Scanner(System.in);
    year = scan.nextInt();

    //In the In the Gregorian calendar three criteria must be taken into account to identify leap years:
    //The year can be evenly divided by 4;
    //If the year can be evenly divided by 100, it is NOT a leap year, unless;
    //The year is also evenly divisible by 400. Then it is a leap year.
    if (year%4==0)
    {
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println(year + " is a leap year");
            }
            else
            {
                System.out.println(year + " is not a leap year");
            }
        }
        else
        {
            System.out.println(year + " is a leap year");
        }
    }
    else
    {
        System.out.println(year + " is not a leap year");
    }
}
}

