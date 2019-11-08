public class PalindromeChecker {

    //Check wether a string is palindrome, return true or false
    public boolean isPalindrome(String s){
        int length = s.length();
        for (int i = 0; i < length; i++){
            if (s.charAt(i) != s.charAt(length-1))
                return false;
            length--;
        }
        return true;
    }

    //Check wether a string is palindrome by using recursive method, return true or false
    public boolean isPalindromeRecursive(String s){
        int length = s.length();
        //Termination
        if (length < 2)
            return true;
        else {
            if (s.charAt(0) == s.charAt(length-1))
                this.isPalindromeRecursive(s.substring(1, length-1))
            else
                return false;
        }
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        System.out.println("Palindrome Test");      
        System.out.println(pc.isPalindrome("test")); 
        System.out.println(pc.isPalindrome("bob")); 
        System.out.println(pc.isPalindrome("kasurrusak")); 

        System.out.println("Palindrome Recursive Test");              
        System.out.println(pc.isPalindrome("test")); 
        System.out.println(pc.isPalindrome("bob")); 
        System.out.println(pc.isPalindrome("kasurrusak")); 
    }
}

