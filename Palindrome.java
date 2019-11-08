java.util.Scanner;

class Palindrome
{
    // Program begins with a call to main().
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        boolean noPalindrome=false;

        int n=str.length;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                noPalindrome=true;
                break;
            }
        }

        if(noPalindrome)
            System.out.println("String is not palindrome!");
        else
            System.out.println("String is palindrome!");

    }
}