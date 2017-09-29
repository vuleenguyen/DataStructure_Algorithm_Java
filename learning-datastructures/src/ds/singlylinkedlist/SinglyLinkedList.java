package ds.singlylinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class SinglyLinkedList {

    private Node first;
    private Node last;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data, first);
        first = newNode;
        if (last == null) {
            last = first;
        }
    }

    public void insertLast(int data) {
        Node last = new Node(data, null);
        if (this.last != null) {
            this.last.next = last;
        }
        this.last = last;
    }

    public Node deleteFirst() {
        Node temp = first;
        Node newFirst = first.next;
        first.next = null;
        first = newFirst;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node temp = first;
        while(temp != null) {
           temp.displayNode();
           temp = temp.next;
        }
    }
}
