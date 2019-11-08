

public Node reverse(Node head){
	Node curr = head;
	Node prev = null;

	while(curr!=null){
		Node temp1 = curr.next;
		curr.next = prev;
		prev = curr;
		curr = temp;
}
return prev;
}


