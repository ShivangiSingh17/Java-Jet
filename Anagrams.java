import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagrams {
	//Use Regular Expression to remove punctutations and apostrophes
	private static final Pattern PATTERN = Pattern.compile("[,.;:'\\s]+");

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		scan.close();
		System.out.printf("Is %s ANAGRAM of %s ? %b", word1, word2, isAnagram(word1, word2));
	}
	
	private static boolean isAnagram(String str1, String str2) {
		char[] sstr1 = getCharacters(str1);
		char[] sstr2 = getCharacters(str2);
		
		// If two strings have different length
	    if (sstr1.length != sstr2.length)  
	    {  
	        return false;  
	    }  
	  
	    // To store the XOR value
	    //0 ^ 0 = 0
	    //0 ^ 1 = 1
	    //1 ^ 0 = 1
	    //1 ^ 1 = 0
	    //i.e. anagram ^ anagram = 0
	    int value = 0;  
	  
	    for (int i = 0; i < sstr1.length; i++)  
	    {  
	        value = value ^ (int) sstr1[i];  
	        value = value ^ (int) sstr2[i];  
	    }
	    return value == 0; 
	}

	private static char[] getCharacters(String word) {
		Matcher m = PATTERN.matcher(word);
		return m.replaceAll("").toUpperCase().toCharArray();
	}

}
