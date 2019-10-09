import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int x=n;int s=0;
		while(n!=0) {
			int d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(s==x)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
			
				
	}
}
