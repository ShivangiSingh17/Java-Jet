public class StringPalindrome {
	public boolean isPalindrome(String str) {
	    str = str.toLowerCase();
	    String reverseStr = "";
	    for (int i = str.length() - 1; i >= 0 ; i--) {
	    	reverseStr = reverseStr + str.charAt(i);
	    }
	    return reverseStr.equals(str);
	}
}