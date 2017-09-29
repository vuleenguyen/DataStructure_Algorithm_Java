package ds.queue;

/**
 * Created by Do My Duyen on 9/21/2017.
 */
public class Queue {

    private int maxSize; // maintain the set numbers of slots
    private long[] queueArray; // slots to maintain the data
    private int front; // the index position for the element in the front
    private int rear; // the index position for the element in the back
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size) {
        maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0; // index position of the first slot
        rear = -1; // there is no item in the array yet to be considered to the last item
        nItems = 0; // we don't have element in array yet
    }

    public void insert(long value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        nItems++;
        this.queueArray[rear] = value;
    }

    public long remove() {
        int oldfront = front;
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return this.queueArray[oldfront];
    }

    public long peekFront() {
        return this.queueArray[front];
    }

    public long peekRear() {
        return this.queueArray[rear];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void view() {
        System.out.print("[");
        for(int i = 0 ; i <= rear; i++) {
            System.out.print(this.queueArray[i] + " ");
        }
        System.out.print("]");
    }
}
