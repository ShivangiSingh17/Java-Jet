/*
    Prints all the values in the range of 1 to 100 in reverse order
*/

class Divisibility {
    public static void main(String[] args)
    {
        for(int i=100; i>=0; i--) 
        {
            if(i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}