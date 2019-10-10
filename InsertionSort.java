package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class InsertionSort {
        ArrayList<Integer> numbers;
        public InsertionSort(ArrayList<Integer> number) {
            this.numbers = number;
        }

        public ArrayList<Integer> getNumber() {
            return numbers;
        }

        public void setNumber(ArrayList<Integer> number) {
            this.numbers = number;
        }

        public ArrayList<Integer> insertionSort() {
            int temp;
            for (int i = 1; i < numbers.size(); i++)
            {
                temp = numbers.get(i);
                for (int j = i; j > 0; j--)
                {

                    if ( numbers.get(j-1) < temp)
                    {
                        numbers.set(j, temp);
                        break;

                    }
                    else if ( numbers.get(j-1) >= temp)
                    {
                        numbers.set(j,  numbers.get(j-1));
                        numbers.set(j-1,  temp);
                    }

                }
            }
            return numbers;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please write numbers (stop this if you press 0): ");
        int n = in.nextInt();
        while(n != 0){
            numbers.add(n);
            n = in.nextInt();
        }

        InsertionSort is = new InsertionSort(numbers);
        System.out.println(numbers.toString());

        numbers = is.insertionSort();
        System.out.println("Sorted array: ");
        for(int i = 0; i <numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        }
}
