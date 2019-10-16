/*RockLee444*/
import java.util.Scanner; 
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Write a sentence and press enter to know if it is a palindrome.");
        word = sc.nextLine();
        String[] wordArray = word.toUpperCase().split(" ");
        String noBlanksWord="";
        for(int i=0;i<wordArray.length;i++){
            noBlanksWord+=wordArray[i];
        }
        
        if(verifyWord(noBlanksWord)){
            System.out.println("The sentence: " + word + " IS a palindrome.");
        } else {
            System.out.println("The sentence: " + word + " IS NOT a palindrome.");
        }
        sc.close();
        
    }

    public static boolean verifyWord(String word){
        boolean isPalindrome = false;
        char[] normalWordArray = word.toCharArray();
        char[] inverseWordArray = new char[normalWordArray.length];
        
        int j=0;
        //Filling the inverseWordArray 
        for(int i=normalWordArray.length-1;i>=0;i--){
            inverseWordArray[j] = normalWordArray[i];
            j++;
        }
        //Verifying if it is palindrome
        int counter=0;
        for(int i=0; i<normalWordArray.length;i++){
            if(normalWordArray[i] == inverseWordArray[i]){
                counter++;
            }
        }
        if(counter==normalWordArray.length){
            isPalindrome = true;
        }
        else{
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
