package com.codingblocks.lecture_19;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(String value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (size == 0){
            tail = head;
        }
        size++;
    }

    public void oddEven(){
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        Node node = head;

        while (node != null){
            if (node.value.length() % 2 == 0){
                even.insertLast(node.value);
            } else {
                odd.insertLast(node.value);
            }
            node = node.next;
        }

        odd.tail.next = even.head;
        head = odd.head;
        tail = even.tail;
    }

    public void insertLast(String value){
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void removeDup(){
        Node node = head;

        while (node.next != null){
            if (node.value.equals(node.next.value)){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
    }

    public void removeDupRec(){
        removeDupRec(head);
    }

    private void removeDupRec(Node node){
        if (node.next == null){
            tail = node;
            return;
        }

        if (node.value.equals(node.next.value)){
            node.next = node.next.next;
            size--;
            removeDupRec(node);
        } else {
            removeDupRec(node.next);
        }
    }

    public void reverse(){
        Node prev = null;
        Node present = head;

        while (present != null){
            Node next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }

        tail = head;
        head = prev;
    }

    public String deleteFirst(){
        String value = head.value;
        head = head.next;

        if (size == 1){
            tail = head;
        }

        size--;
        return value;
    }

    public String deleteLast(){
        if (size == 1){
            return deleteFirst();
        }

        Node prev = head;
        while (prev.next != tail){
            prev = prev.next;
        }

        String value = tail.value;
        tail = prev;
        tail.next = null;

        size--;
        return value;
    }

    public void insert(int index, String value){
        if (index == 0){
            insertFirst(value);
            return;
        } else if (index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;
    }

    public String delete(int index){
        if (index == 0){
            return deleteFirst();
        } else if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        String value = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return value;
    }

    private Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }


    private class Node {
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
