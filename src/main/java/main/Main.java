package main;

import LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createLinkedList(5);
        sll.insertInLinkedList(10, 1);
        sll.insertInLinkedList(15, 2);
        sll.insertInLinkedList(20, 3);
        sll.traverseLinkedList();

        // Deleting nodes
        sll.deleteNode(0);
        sll.traverseLinkedList();
        sll.deleteNode(2);
        sll.traverseLinkedList();
        sll.deleteNode(1);
        sll.traverseLinkedList();
    }
}
