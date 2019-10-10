import java.util.*;

public class prime
{
	public static void main(String[] args)
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=x;i>0;i--)
		{if(x%i==0)
		c++;}
		if(c==2)
		System.out.println("prime");
		else
		System.out.println("not prime");
	}
}

