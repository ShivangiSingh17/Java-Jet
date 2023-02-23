import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // Every 400th year is a leap year while every 100th is not
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            System.out.println("The Year " + year + " is a Leap Year.");
        else
            System.out.println("The Year " + year + " is NOT a Leap Year.");
    }
}
