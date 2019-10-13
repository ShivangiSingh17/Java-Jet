public class MiddleElements {


    /**
     * Given two numbers a and b between 1 and 100, write a program that can print the even elements between a and b.
     * Example:
     * a=4, b= 17
     * Output: 6 8 10 12 14 16
     */


    public String middleElements(int a, int b){

        if (a<1 || b>100)
             return "a and b should be 1 <= a and b <= 100 ";


        StringBuilder sb = new StringBuilder();


        for(int i=a; i<=b; i++){

            if (i%2 == 0)
                sb.append(i);

        }

        return sb.toString();
    }

}
