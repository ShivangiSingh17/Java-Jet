package Queues;

public class QueueWithArray {
    private Integer[] data;
    private int top;

    public QueueWithArray(Integer max_size) {
        this.data = new Integer[max_size];
        this.top = -1;
    }

    public void Push(Integer input) throws ArrayIndexOutOfBoundsException{
        if(top == data.length - 1)
            throw new ArrayIndexOutOfBoundsException();
        data[++top] = input;
    }

    public Integer Pop() {
        if(top == -1)
            return null;

        var tempValue = data[0];
        for(int i = 0; i < data.length - 2; i++){
            data[i] = data[i+1];
        }
        data[top--] = null;
        return tempValue;
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
        QueueWithArray myQueue = new QueueWithArray(10);
        System.out.println("New Queue: " + myQueue);
        myQueue.Push(10);
        myQueue.Push(15);
        myQueue.Push(3);
        System.out.println("Queue after adding values: " + myQueue);
        System.out.println("Result of popping first item: " + myQueue.Pop());
        System.out.println("Final Queue: " + myQueue);
    }
}
