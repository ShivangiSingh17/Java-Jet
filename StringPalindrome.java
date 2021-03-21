import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String temp="";
		for(int i=s.length()-1;i>=0;i--){
			temp += s.charAt(i);	
		}
		if(temp.equals(s)){
			System.out.println("String " + s + " is Palindrome.");
		}else{
			System.out.println("String " + s + " is not Palindrome.");
		}

	}

}
