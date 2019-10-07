import java.util.HashMap;
import java.util.Map;

public class Anagram {
	static boolean checkForValidAnagrams(String str1, String str2) {
		Map<Character, Integer> dataMap = new HashMap<>();
		int lengthOfStr1 = str1.length();
		int lengthOfStr2 = str2.length();

		if (lengthOfStr1 != lengthOfStr2) {
			return false;
		}

		for (int index = 0; index < lengthOfStr1; index++) {
			Character key = str1.charAt(index);
			if (dataMap.containsKey(key)) {
				dataMap.put(key, dataMap.get(key) + 1);
			} else {
				dataMap.put(key, 1);
			}
		}

		for (int index = 0; index < lengthOfStr2; index++) {
			Character key = str2.charAt(index);
			if (dataMap.get(key) != null) {
				dataMap.put(key, dataMap.get(key) - 1);
			} else {
				return false;
			}
		}
		for (Map.Entry<Character, Integer> entry : dataMap.entrySet()) {
			if (entry.getValue() != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = new String("nitin");
		String str2 = new String("iitnn");

		System.out.println(str1 + " and " + str2
				+ " are".concat(checkForValidAnagrams(str1, str2) ? " " : " not ").concat("anagrams"));
	}
}
