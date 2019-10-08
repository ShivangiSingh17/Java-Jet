/**
 * This class represents a Node in SinglyLinkedList
 * Node has Integer data and a next pointer
 */
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

/**
 * This is SinglyLinkedList with head
 */
class SinglyLinkedList {
	private Node head;

	/**
	 * Inserts given data to end of linked list
	 * @param data Data to insert
	 */
	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		for (; current.next != null; current = current.next);

		current.next = newNode;
	}

	/**
	 * Displays complete Linked List
	 */
	public void display() {
		if (head == null) {
			System.out.println("List is Empty!");
			return;
		}

		Node current = head;
		System.out.print("Linked List: ");
		for (;  current != null; current = current.next)
			System.out.print(current.data + " ");
		System.out.println();
	}

	/**
	 * Finds the center element in this Linked List in one pass only
	 * @return the middle element
	 */
	public int getMiddleElement() {
		if (head == null) return 0;

		Node jumpOne = head;
		Node jumpTwo = head;

		while (jumpTwo != null) {
			if (jumpTwo.next != null) {
				jumpTwo = jumpTwo.next.next;
				jumpOne = jumpOne.next;
			} else break;
		}

		return jumpOne.data;
	}
}

public class LinkedList {
	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();

		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.insert(50);

		linkedList.display();

		System.out.println( linkedList.getMiddleElement() );

	}
}

