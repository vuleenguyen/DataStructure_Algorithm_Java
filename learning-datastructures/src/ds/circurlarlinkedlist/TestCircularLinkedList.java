package ds.circurlarlinkedlist;

import ds.singlylinkedlist.SinglyLinkedList;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class TestCircularLinkedList {

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(101);
        myList.insertFirst(25);
        myList.insertLast(300);

        myList.displayList();

        myList.deleteFirst();
        myList.displayList();
        myList.deleteLast();
        myList.displayList();
    }
}
