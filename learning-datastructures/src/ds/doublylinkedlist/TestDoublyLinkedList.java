package ds.doublylinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class TestDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(66);
        list.insertFirst(55);
        list.insertFirst(44);
        list.insertFirst(33);
        list.insertFirst(22);
        list.insertLast(77);
        list.insertLast(88);
        list.displayForward();

        list.deleteFirst();
        System.out.println("Delete first");
        list.displayForward();
        list.deleteLast();
        System.out.println("Delete last");
        list.displayForward();

        System.out.println("Insert After -1: " + list.insertAfterIndex(-1, 3));
        System.out.println("Insert After 6: " + list.insertAfterIndex(6, 3));

        System.out.println("Insert After 2: " + list.insertAfterIndex(2, 100));
        list.displayForward();

        System.out.println("Insert After 5: " + list.insertAfterIndex(5, 101));
        list.displayForward();

        System.out.println("Insert After Key 77: " + list.insertAfterKey(77, 300));
        list.displayForward();

        System.out.println("Insert After Key 101: " + list.insertAfterKey(101, 400));
        list.displayForward();

        System.out.println("Insert After Key 500: " + list.insertAfterKey(500, 400));
        list.displayForward();


        System.out.println("Delete Key 300: " + list.deleteKey(300));
        list.displayForward();

        System.out.println("Delete Key 400: " + list.deleteKey(400));
        list.displayForward();

        System.out.println("Delete Key 33: " + list.deleteKey(33));
        list.displayForward();

        System.out.println("Delete Key 101: " + list.deleteKey(101));
        list.displayForward();

        System.out.println("Delete Key 54: " + list.deleteKey(54));
        list.displayForward();

        System.out.println("Reverse list");
        list.displayBackWard();
    }
}
