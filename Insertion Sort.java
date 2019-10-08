// Java program for implementation of Insertion Sort 
class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1; 

			/* Move elements of a[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    // Driver method 
    public static void main(String args[])
    {
        int a[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(a);

        printArray(a);
    }
} 
