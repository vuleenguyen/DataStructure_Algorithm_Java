package ds.singlylinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class Node {

    public int data;
    public Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void displayNode() {
        System.out.println("{ " + data + " }");
    }
}
