package ds.stack;

/**
 * Created by Do My Duyen on 9/21/2017.
 */
public class Stack {

    private int maxSize; // this variable store size of Stack
    private char[] stackArray; // list of item in stack
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1; //because nothing in a top right now
    }

    public void push(char newValue) {
       if (isFull()) {
           System.out.println("The current Stack Full, Can't push more");
       } else {
           top++;
           stackArray[top] = newValue;
       }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Current Stack is empty");
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
        return ' ';
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
