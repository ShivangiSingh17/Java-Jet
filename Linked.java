/*
 * Linked.java
 * 
 * Copyright 2019 Reshma-rajan <Reshma-rajan@RESHMA-PC>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
public class Linked {

	public static void main(String[] args) {
		node n = new node(0);
		n.data=4;
		node p=new node(0);
		p.data=10;
		n.next=p;
		// TODO Auto-generated method stub
		//System.out.println(n.data+" "+p.data);
		ll l=new ll();
		l.inserts(3);
		l.inserts(8);
		l.inserts(4);
		l.inserts(23);
		l.print();
		l.insertm(2,35);
		l.print();
		l.del();
		//l.sort();
		l.print();
		System.out.println();
		System.out.println(l.search(4));
		System.out.println(l.search(17));
		

	}

}
public class node {
	//int data;
	node next;
	public int data;
	node(int k){
		data=k;
	}

}



public class ll {
	public node head;
	public void insert(int d)
	{
		node n = new node(d);
		//n.data=d;
		if(head==null)
		{	head=n;}
		else{
		 	node curr = head;
		 while(curr.next!=null)
			 curr=curr.next;
		 curr.next=n;}
		
	}
	public void insertf(int k){
		if(head==null)
			head=new node(k);
		else
		{
			node t=new node(k);
			t.next=head;
			head=t;
		}
	}
	public void delete(){
		if(head==null)
			System.out.println("Empty");
		else
		{
			head=head.next;
		}
	}
	public void print()
	{
		node curr=head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	public int search(int k){
		int pos=0;
		node curr=head;
		while(curr!=null)
		{
			if(curr.data==k)
				return pos;
			else
			{
				pos++;
				curr=curr.next;
				}}
		return -1;
	}
	public void insertm(int pos,int key){
		node cur=head;
		for(int i=0;i<pos-1;i++)
		{
			cur=cur.next;
		}
		node temp=new node(key);
		temp.next=cur.next;
		cur.next=temp;
	}
	public void del(){
		node cur=head;
		while(cur.next.next!=null)
			cur=cur.next;
		cur.next=null;
	}
	public void sort(){
		node cur=head;
		
		while(cur!=null)
		{node ind=cur.next;
			while(ind!=null){
				if(cur.data>ind.data)
				{
					int t=cur.data;
					cur.data=ind.data;
					ind.data=t;
					}
				ind=ind.next;
				}
			cur=cur.next;}}


	void inserts(int key) {
        if (head == null) {
            head = new node(key);
            //head.data = key;
            return;
        }

        // Find the position to insert
        node curr = head;
        int pos = 0;
        while (curr != null && curr.data < key) {
            curr = curr.next;
            pos++;
        }
        insertm(pos, key); // Insert at that position
    }    
}
