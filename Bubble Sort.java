// Java program for implementation of Bubble Sort
class BubbleSort
{
    void bubbleSort(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and a[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }

    /* Prints the array */
    void printArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(a);
        System.out.println("Sorted aay");
        ob.printArray(a);
    }
}
