public class BubbleSort{
  
  public static void main(String[] args){
    int arr[] = {23, 98, 11, 45, 36, 98, 90};
    System.out.println("Before Sorting");
    for(int a: arr){
      System.out.print(a+" ");
    } 
    bubbleSort(arr);
    System.out.println("After Sorting");
    for(int b: arr){
      System.out.print(b+" ");
    }
    
  }
  
  /*
   * Bubble Sorting method
   */
  public static void bubbleSort(int[] numbers) {
      for (int i = 0; i < numbers.length; i++) {
          for (int j = numbers.length-1; j > i; j--) {
              //Swap if numbers[j] is small then numbers[j-1]
              if (numbers[j] < numbers[j - 1]) {
                  int temp = numbers[j];
                  numbers[j] = numbers[j-1];
                  numbers[j-1] = temp;
              }
          }
      }
  }
}
