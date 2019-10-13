import java.util.Scanner;
public class print_even_no_bw_two_no {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the range of two numbers betwwen 1 and 100");
	        int a = in.nextInt();
	        int b = in.nextInt();
	        for(int i=a+1;i<b;i++) {
	        	if(i%2==0) {
	        		System.out.println(i);
	        	}
	        }
	}

}


               
 