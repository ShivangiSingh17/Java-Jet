
import java.util.*;
import java.lang.*;
import java.io.*;


class SimpleJavaProgram

{
	static  int sqrt(int a) {
  long low = 1, high = a;

  while (low <= high) {
    long mid = (high + low) / 2;
    long current = mid * mid;

    if (current == a) {
      return (int) mid;
    } else if (current < a) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return (int) high;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a=11;
		int ans = sqrt(a);
		System.out.print(ans);
		
	}
}
