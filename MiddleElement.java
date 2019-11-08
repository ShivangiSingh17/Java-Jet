import java.util.ArrayList;
import java.util.List;

public class MiddleElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(4);

		Node headNode = createLinkedList(list);
		System.out.println("Middle element is: " + getMiddleElementInLinkedList(headNode));
	}

	private static Node createLinkedList(List<Integer> list) {
		Node headNode = null;

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				headNode = new Node(list.get(i));
			} else {
				Node newNode = new Node(list.get(i));
				Node temp = headNode;

				while (temp.nextNode != null) {
					temp = temp.nextNode;
				}
				temp.nextNode = newNode;
			}
		}
		return headNode;
	}

	private static int getMiddleElementInLinkedList(Node headNode) {
		Node ptr1, ptr2;
		ptr1 = headNode;
		ptr2 = headNode;

		while (ptr2 != null && ptr2.nextNode != null) {
			ptr1 = ptr1.nextNode;
			ptr2 = ptr2.nextNode.nextNode;
		}
		return ptr1.value;
	}

}

class Node {
	int value;
	Node nextNode;

	public Node(int value) {
		this.value = value;
		nextNode = null;
	}
}