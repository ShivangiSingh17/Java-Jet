public class palindrome{
	public static void main(String[] args){
		//Creating an array of words
		String[] array = {"Bob","Anna","Civic","Kayak","Level","Mom","Noon","Mother","Motor","Word","Window"};
		//Using for each to check each word
		for (String word: array){
			//This format prints thw word and then calls the function to check if the word we sent
			//is actually a palindrome
			System.out.println("is "+word+" a palindrome?\n"+checkForPalindromes(word));
		}
	}

	//Function to check palindromes
	public static boolean  checkForPalindromes(String word){
		//Recibe a word to then set it into lower case, and then we erase al the spaces,dots and comas
		word = word.toLowerCase().replace(" ","").replace(".","").replace(",","");
		//we re-build the word and assigned it into a new word
		String inverted = new StringBuilder(word).reverse().toString();
		//Finally we make a comparison to make sure that the word inverted is the same as the word in lowe case.
		if (inverted.equals(word)){
			return true;
		}else{
			return false;
		}
	}
}