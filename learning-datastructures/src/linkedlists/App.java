package linkedlists;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class App {

    public static void main(String[] args) {
        Node n1 = new Node(3);
        n1.setNextNode(4);
        Node n2 = n1.getNextNode();
        n2.setNextNode(5);
        System.out.println(viewLinkedList(n1));
    }

    public static int viewLinkedList(Node n1) {
        int count = 0;

        while(n1 != null) {
            count++;
            n1 = n1.getNextNode();
        }

        return count;
    }
}
