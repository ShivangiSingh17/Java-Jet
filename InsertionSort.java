/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prachi
 */
import java.util.Scanner;
public class InsertionSort {
   
    int[] insertionSort(int a[], int n)  
    {  
        int i, key, j;  
        for (i = 1; i < n; i++) 
        {  
            key = a[i];  
            for (j=i-1;j >= 0 && a[j] > key;j--) 
            {  
                a[j + 1] = a[j];  

            }  
            a[j + 1] = key;  
        }
        return a;
    }
    public static void main(String[] args)
    {
        InsertionSort is = new InsertionSort();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = in.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        a = is.insertionSort(a,n);
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++)
            System.out.print(a[i]+" ");
    }   
}
