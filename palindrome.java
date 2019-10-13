// this is a java program to check whether the given string (non-case-sensitive) is a palindrome or not.
import java.util.*;
public class alpha
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s= sc.nextLine();
		String s1="",s2="";
    //to handle case - sensitivity, converted every charactter to upper  case
		for(int i=0;i<s.length();i++)
			s1+=Character.toUpperCase(s.charAt(i));
    //to check for palindrome, appended every character of the upper case string to the beginning of a new string
		for(int i=0;i<s.length();i++)
			s2=s1.charAt(i)+s2;
		if(s1.equals(s2))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
  }
}
