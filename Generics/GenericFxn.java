package lect25Generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericFxn {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };
		Car[] carr = new Car[5];
		carr[0] = new Car(100, 10, "Black");// will store address to print we need to override toString(ctrl+space
											// toString)
		carr[1] = new Car(200, 20, "Blue");
		carr[2] = new Car(700, 30, "Red");
		carr[3] = new Car(50, 40, "White");
		carr[4] = new Car(500, 50, "Grey");
		/*display(carr);
		Bubblesort(carr,new CarSpeedComparator());
		display(carr);
		Bubblesort(carr,new CarPriceComparator());
		display(carr);
		Bubblesort(carr,new CarColorComparatoArrayList<E>display(carr);*/
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		System.out.println(list.size());
		list.add(new ArrayList<>());
		list.get(0).add(10);
		list.get(0).add(20);
		list.add(new ArrayList<>());
		list.get(1).add(30);
		list.get(1).add(40);
		list.add(new ArrayList<>());
		list.get(2).add(50);
		list.get(2).add(60);
		System.out.println(list.get(0));
		System.out.println(list);
		 
		LinkedListGeneric<ArrayList<Integer>> ll  = new LinkedListGeneric<>();
		ll.addLast(list.get(0));
		ll.addLast(list.get(1));
		ll.addLast(list.get(2));
		ll.display();
		
		
	}

	public static <T> void display(T[] arr) {
		for (T var : arr)
			System.out.println(var);
		System.out.println("-_- -_- -_- -_- -_- -_-");
	}

	public static <T extends Comparable<T>> void Bubblesort(T[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0)// cannot compare two addresses we can only use == and != for
														// addresses
				{
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		} 
	}

	public static <T> void Bubblesort(T[] arr, Comparator<T> comp) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (comp.compare(arr[j], arr[j + 1]) > 0)
				{
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
