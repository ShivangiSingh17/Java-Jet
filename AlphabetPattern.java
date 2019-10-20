public class AlphabetPattern{
	public static void main(String args[]){
		char c = 'A';
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j <= i; j++)
				System.out.print((char)(c + j) + " ");
			System.out.println();
		}
	}
}