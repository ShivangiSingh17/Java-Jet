package com.company;


/* This is a simple Java program.
   FileName : "HelloWorld.java". */
class Divisible_by_7 {
    // Program begins with a call to main().
    // Prints "Hello World!!" to the terminal window.
    public static void main(String args[]) {
        System.out.println("Hello World!!!");
        int n = 0;
        System.out.println("All numbers divisible by 7 in the reverse order from 1000 to 0 are: ");
        for (int i = 1000; i >= n; i--) {
            if (i % 7 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}