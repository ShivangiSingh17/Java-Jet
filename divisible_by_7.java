class divisible{
  static void result(int N){
    for(int num = N;num>0;num--){
      if(num % 7 == 0){
        System.out.print(num+ " ");
      }
    }
  }

  public static void main(String []args){
    int N=100;

    result(N);
  }
}
