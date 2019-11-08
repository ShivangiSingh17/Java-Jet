
import java.util.Scanner;

public class Armstrong {
	
	public void checkForArmstrong(int n)
	{
		int n2=n;
		int sum=0;
		while(n>0)
		{
			int n1=n%10;
			n1=n1*n1*n1;
			sum+=n1;
			n=n/10;
		}
		
		if(sum==n2)
		{
			System.out.println("Its an Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
	
	public static void main(String args[])
	{
		Armstrong obj=new Armstrong();
		System.out.println("Enter a number to be checked");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		obj.checkForArmstrong(n);
	}

}
