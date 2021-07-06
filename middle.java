import java.util.*; 
public class middle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter the starting number");
		int a= in.nextInt();
    	System.out.println("\nEnter the ending number");
    	int b= in.nextInt();
    	System.out.println("\nThe even numbers are:");
    	for(int j=a+1;j<b;j++)
		 	{if(j%2==0)
		 	System.out.print(j+" ");
		 }

	}
}