/* This is a simple Java program to print the following pattern.
expected Output : *
                  *
                  *
                  *
                  *
 FileName : "pattern.java". 
*/
class HelloWorld
{
    // Program begins with a call to main().
    public static void main(String args[])
    {
        patternGenerator(5);
    }
   
   //function to print the pattern
   public static void patternGenerator (int n) {
      if(n==0)
        return;
      System.out.println("*");
      patternGenerator(--n);
   }
}
