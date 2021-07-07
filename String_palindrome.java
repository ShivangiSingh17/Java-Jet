import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		for (int i = s1.length()-1; i >= 0; i--) 
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s2.equals(s1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
