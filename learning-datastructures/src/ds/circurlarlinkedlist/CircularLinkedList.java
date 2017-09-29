package ds.circurlarlinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if (isEmpty()) {
            last = newNode;
        }
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        Node currentNode = first;
        while (currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

    public int deleteFirst() {
        System.out.println("Delete first element");
        int tempValue = first.data;
        if (first.next == null) {
            first = null;
            last = null;
            return tempValue;
        }

        Node nextFirst = first.next;
        first.next = null;
        first = nextFirst;

        return tempValue;
    }

    public int deleteLast() {
        System.out.println("Delete last element");
        int tempValue = last.data;
        if (first.next == null) {
            last = null;
            first = null;
            return  tempValue;
        }
        Node currentNode = first;
        Node beforeLast = null;

        while (currentNode.next != null) {
            beforeLast = currentNode.next;
            if (beforeLast.next != null && beforeLast.next.next == null) {
                break;
            }
            currentNode = currentNode.next;
        }
        beforeLast.next = null;
        last = beforeLast;

        return tempValue;

    }
}
