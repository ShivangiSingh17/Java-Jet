public class Solution {

	static boolean areAnagram(char[] str1, char[] str2) {

		// If length of both strings is not same,
		// then they cannot be anagram
		if (str1.length != str2.length)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < str1.length; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

}
