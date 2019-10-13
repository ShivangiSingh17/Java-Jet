import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] char_countArr = new int[26];
        
        System.out.printf("Input sentences: ");
        String sentences = sc.nextLine();
        sentences.toLowerCase();
        
        for(char c: sentences.toCharArray())
            if(c > 96 && c < 123 )
                char_countArr[c - 'a']++;
            
        for(int i = 0; i < 26; i++)        
            if(char_countArr[i]>1)
                System.out.println(String.valueOf((char)('a'+i)) + " = " + char_countArr[i]);                    
    }
}
