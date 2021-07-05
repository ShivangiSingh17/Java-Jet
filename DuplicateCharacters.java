import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		char[] str=sc.next().toCharArray();
		
		List<Character> buffer=new ArrayList<>();
		
		for(char c : str) {
			if(!buffer.contains(c))
				buffer.add(c);
			else 
				System.out.println(c);
		}
	}

}
