package ds.singlylinkedlist;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class Test {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);

        myList.displayList();

        myList.insertLast(101);
        myList.insertFirst(25);
        myList.insertLast(300);

        myList.displayList();
    }
}
