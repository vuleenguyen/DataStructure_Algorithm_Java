package ds.doublylinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class Node {

    public int data;
    public Node next, previous;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.println("{ " + data+ " }");
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
