class QueueUsingLL{
	private class Node{
		int data;
		Node next;
	}
	Node front,rear;
	
	boolean isEmpty(){
		if(front == null && rear == null){
			return true;
		}
		else{
			return false;
		}
	}
	void enqueue(int key){
		Node temp = new Node();
		temp.data = key;
		temp.next = null;
		if(front == null && rear == null){
			front = rear = temp;
		}
		else{
			rear.next = temp;
			rear = temp;
		}
	}
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else if(front == rear){
			front = rear = null;
		}
		else{
			front = front.next;
		}
	}
}
