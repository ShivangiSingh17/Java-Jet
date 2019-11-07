class PalindromeExample{  
 public static void main(String args[]){  
  int r=0;
  int sum=0
  int temp=0;    
  int n=454; 
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
