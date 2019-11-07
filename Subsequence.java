public class Subsequence{
    
    public static String findLongestSubsequence(String a, String b){
        for(int i = a.length(); i>0;i--) {
            for (int j = a.length() - i; j >= 0; j--) {
                if (b.contains(a.substring(j, j + i))) return a.substring(j, j + i);
            }
        }
        return "";
    }
}