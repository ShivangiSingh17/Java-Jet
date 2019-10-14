package lect25Generics;

//code by megha gupta
public class LinkedListGeneric<T> {
	private class Node {
		T data;
		Node next;

		Node(T a) {
			data = a;
		}

		Node() {

		}
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public T getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is empty");
		} else
			return head.data;
	}

	public T getLast() throws Exception {
		if (isEmpty())
			throw new Exception(" LL Is empty");
		else
			return tail.data;
	}

	public T getAt(int k) throws Exception {
		if (isEmpty())
			throw new Exception(" LL is empty");
		if (k < 0 || k >= size)
			throw new Exception("Invalid index");
		Node temp = head;
		for (int i = 1; i <= k; i++)
			temp = temp.next;
		return temp.data;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void addLast(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (!isEmpty())// tail is 4k last node
			tail.next = nn;// 5k

		if (isEmpty())
			head = nn;

		size++;
		tail = nn;// tail will point to nn
	}

	public void addFirst(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		nn.next = head;

		if (!isEmpty())
			head = nn;

		if (isEmpty()) {
			head = nn;
			tail = nn;
		}
		size++;
	}

	public void addAt(T item, int k) throws Exception {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (k < 0 || k > size)
			throw new Exception("Invalid entry");
		if (k == 0)
			addFirst(item);
		else if (k == size)
			addLast(item);
		else {
			Node a = getnodeAt(k - 1);
			Node b = getnodeAt(k);
			a.next = nn;
			nn.next = b;
			size++;
		}
	}

	public Node getnodeAt(int k) throws Exception {
		if (isEmpty())
			throw new Exception(" LL is empty");
		if (k < 0 || k >= size)
			throw new Exception("Invalid index");
		Node temp = head;
		for (int i = 1; i <= k; i++)
			temp = temp.next;
		return temp;
	}

	public T removeFirst() throws Exception {
		if (size == 0)
			throw new Exception("LL is empty");

		T rv = head.data;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.next;
			size--;
		}
		return rv;
	}

	public T removeLast() throws Exception {

		if (size == 0)
			throw new Exception("LL is empty");

		T rv = tail.data;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			Node nm2 = getnodeAt(size - 2);
			tail.next = null;
			tail = nm2;
			size--;
		}
		return rv;
	}

	public T removeAt(int k) throws Exception {
		if (size == 0)
			throw new Exception("LL is empty");
		if (k < 0 || k >= size)
			throw new Exception("invalid index");
		if (k == 1)
			return removeFirst();
		else if (k == size - 1)
			return removeLast();
		else {
			Node nm1 = getnodeAt(k - 1);
			Node n = getnodeAt(k);
			Node np1 = getnodeAt(k + 1);
			T rv = n.data;
			nm1.next = np1;
			size--;
			return rv;
		}
	}

}
