package datastructures.stack;


import java.lang.reflect.Array;

/***
 * stack is abstract data type so here
 * we implement using arrays and also java
 * has Stack interface
 * **/

public class ArrayStack<E> {

    public static final int CAPACITY = 100;
    private int tail = -1;//a pointer that always points to the last element at first it's -1 cause it points no where
    private E[] data;


    public ArrayStack(int capacity) {

        data = (E[]) new Object[capacity];

    }

    public ArrayStack() {

        this(CAPACITY);

    }

    public void push(E element) {

        if (tail == CAPACITY - 1) {

            throw new RuntimeException("Stack is full.");

        }
        data[++tail] = element;//increment before storing new item
        System.out.println(data[tail] + " is added to stack!");

    }

    public E pop() {

        if (tail == -1) {

            return null;

        }
        E topElement=data[tail];
        data[tail] = null;
        tail--;
        return topElement;
    }

    public E peek(){


        if (tail == -1) {

            return null;

        }

        return data[tail];

    }

}




