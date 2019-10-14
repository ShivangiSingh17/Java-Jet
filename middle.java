import  java.util.Scanner;
class middle {
    static int a,b;
    static void reada(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("entre integer a between 1 & 100");
        int x = myObj.nextInt();
        while (x<1 && x>100){
            System.out.println("must be an integer a between 1 & 100");
             x = myObj.nextInt();
        };
        a= x ;
    }
    
    static void readb(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("entre integer b between 1 & 100");
        int x = myObj.nextInt();
        while (x<1 && x>100){
            System.out.println("must be an integer b between 1 & 100");
            x = myObj.nextInt();
        };
        b= x ;
    }
    static void getEven(){
        int x,y;
      if (a>b){x=b;y=a;}else{x=a;y=b;};
        for (int i = x+1 ; i <y;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        reada();
        readb();
        getEven();
    }
}