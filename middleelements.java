import java.io.*;
import java.util.*;
class middleelements {
	public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();  //to get the first input
        int b=input.nextInt();  //to get the second input
        for(int i=a+1;i<=b;i++){
            if(i%2==0){
                System.out.print(i+" ");    //to print the prime numbers between the first number and the second number
            }
        }
        input.close();
        
	}
}