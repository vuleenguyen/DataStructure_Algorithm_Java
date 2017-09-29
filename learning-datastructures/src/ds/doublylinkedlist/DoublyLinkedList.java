package ds.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Do My Duyen on 9/24/2017.
 */
public class DoublyLinkedList {

    private Node first;
    private Node last;
    private int numberOfNode;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
        numberOfNode++;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            this.last.next = newNode;
        }
        newNode.previous = this.last;
        this.last = newNode;
        numberOfNode++;
    }

    public Node deleteFirst() {
        Node deleted = first;
        if (first.next == null) {
            last = null;
            return deleted;
        }
        Node currentNode = first.next;
        currentNode.previous = null;
        first.next = null;
        first = currentNode;
        numberOfNode--;
        return deleted;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
            return temp;
        }
        Node currentNode = last.previous;
        currentNode.next = null;
        last.previous = null;
        last = currentNode;
        numberOfNode--;
        return temp;
    }

    public boolean insertAfterKey(int key, int data) {
        Node currentNode = first;
        while (currentNode.data != key) {
          currentNode = currentNode.next;
          if (currentNode == null) return false;
        }
        if (currentNode.next == null) {
            insertLast(data);
            return true;
        }

        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
        newNode.previous = currentNode;
        numberOfNode++;
        return true;
    }

    public boolean insertAfterIndex(int key, int data) {
        if (key < 0) return false;
        if (key > numberOfNode - 1) return false;
        if (key == numberOfNode - 1) {
            insertLast(data);
            return true;
        }
        int index = -1;
        Node currentNode = first;
        while(currentNode != null && index != key) {
            index++;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
        newNode.previous = currentNode;
        numberOfNode++;
        return true;
    }

    public Node deleteKey(int key) {
        Node currentNode = first;
        while (currentNode.data != key) {
            currentNode = currentNode.next;
            if (currentNode == null) return null;
        }

        if (currentNode == first) return deleteFirst();
        if (currentNode == last) return deleteLast();

        currentNode.previous.next = currentNode.next;
        currentNode.next.previous = currentNode.previous;
        currentNode.previous = null;
        currentNode.next = null;
        numberOfNode--;
        return currentNode;
    }

    public void displayForward() {
        Node currentNode = first;
        while(currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

    public void displayBackWard() {
        Node currentNode = last;
        while(currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.previous;
        }
    }
}
