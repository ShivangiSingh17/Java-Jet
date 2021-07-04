class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 0, z, temp;
        int n = 407; // it is the number to check armstrong
        temp = n;

        while (n > 0) {
            z = n % 10;
            n = n / 10;
            x = x + (z * z * z);
        }

        if (temp == x) {
            System.out.println("Armstrong number is " + x);
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}