
public class JavaReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("abc"));
		System.out.println(reverseString("123!@#098*"));
	}

	public static String reverseString(String in) {
		if (in == null)
			return null;
		StringBuilder out = new StringBuilder(in);
                out.reverse();
                
		
		return out.toString();
	}
}