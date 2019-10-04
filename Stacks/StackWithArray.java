package Stacks;

public class StackWithArray {
    private Integer[] data;
    private Integer top;

    public StackWithArray(int max_size) {
        this.top = -1;
        this.data = new Integer[max_size];
    }

    public void Push(Integer input) throws ArrayIndexOutOfBoundsException {
        if(this.top == data.length - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        data[++top] = input;
    }

    public Integer Pop() {
        if(top == -1)
            return null;
        return data[top--];
    }

    @Override
    public String toString() {
        if(top == -1)
            return "[]";
        String val = "[";
        for (Integer i = 0; i < top; i++){
            val += data[i].toString() + ", ";
        }
        val += data[top] + "]";
        return val;
    }

    public static void main(String[] args){
        StackWithArray myStack = new StackWithArray(10);
        System.out.println("New Stack: " + myStack);
        myStack.Push(10);
        myStack.Push(15);
        System.out.println("Stack after adding values: " + myStack);
        System.out.println("Result of popping first item: " + myStack.Pop());
        System.out.println("Final stack: " + myStack);
    }
}
