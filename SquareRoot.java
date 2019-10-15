/* sqrt() is used to find the square root of a number  
using binary search. */

public class SquareRoot
{
  public int sqrt(int x)
  {
    if(x==0 || x==1)
      return x;
    
    int start = 1, end = x, ans = 0;
    
    while(start <= end)
    {
      int mid = start+((end-start)/2);
      
      if(mid*mid == x)
        return mid;
      
      if(mid*mid < x)
      {
        start = mid + 1;
        ans = mid;
      }
      
      else
        end = mid-1;  
    }
    return ans;
  }
  
  public static void main(String args[])
  {
    SquareRoot obj = new SquareRoot();
    System.out.println(sqrt(25));
  }
}  
      
