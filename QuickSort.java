
public class QuickSort {

	private int array[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length; /* calculate the length of given array */
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;

		/* calculate pivot number, I am taking pivot as middle index number */

		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		/* Divide into two arrays */

		while (i <= j) {
			/*
			 * In each iteration, we will identify a number from left side which is greater
			 * then the pivot value, and also we will identify a number from right side
			 * which is less than the pivot value. Once the search is done, then we will be
			 * exchanging both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);

				/* move index to next position on both sides */

				i++;
				j--;
			}
		}

		/* call quickSort() method recursively */

		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 902, 56, 99, 53, 0 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}