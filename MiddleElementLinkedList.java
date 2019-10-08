
public class MiddleElementLinkedList {
	
	
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.value = 1;
		
		Node n2 = new Node();
		n2.value = 2;
		n1.next = n2;
		
		Node n3 = new Node();
		n3.value = 3;
		n2.next = n3;
		
		Node n4 = new Node();
		n4.value = 4;
		n3.next = n4;
		
		Node n5 = new Node();
		n5.value = 5;
		n4.next = n5;
		
		findMiddleElement(n1);
		
	}
	
	/**
	 * Find and print middle element of linked list
	 * @param start
	 */
	private static void findMiddleElement(Node start) {
		
		if(null == start) {
			System.out.println("List is null.");
			return;
		}
		Node slowPointer = start;
		Node fastPointer = start;
		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println("Middle element is "+slowPointer.value);
	}
	
	static class Node {
		int value;
		Node next;
	}
}	
