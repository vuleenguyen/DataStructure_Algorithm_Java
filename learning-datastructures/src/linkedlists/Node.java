package linkedlists;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class Node {

    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setNextNode(int value) {
        Node node = new Node(value);
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public int getValue() {
        return value;
    }
}
