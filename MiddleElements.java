import java.util.*;
public class MiddleElements
{
	public static void main(String[] args) {
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++)
		{
		    if(i%2==0)
		        System.out.print(i);
		        System.out.print(" ");
		}
	}
}
