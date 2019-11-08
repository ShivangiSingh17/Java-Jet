

import java.util.Scanner;
import java.util.stream.IntStream;

public class MiddleElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int input1=scanner.nextInt();
        int input2=scanner.nextInt(); 
        scanner.close();
                
        IntStream.range(getStart(input1, input2), getEnd(input1, input2))
        	.boxed()
        	.filter(MiddleElements :: isEven)
        	.forEach(System.out:: println);
	}

	private static int getEnd(int input1, int input2) {
		return input1 > input2 ? input1 : input2;
	}

	private static int getStart(int input1, int input2) {
		return input1 <= input2 ? input1 : input2;
	}

	private static boolean isEven(Integer num) {
		return num % 2 == 0;
	}
}
