package com.galvanize;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public int count() {
        return this.size;
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        this.size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node find(Node node) {
        if (head == node) {
            return head;
        }
        Node current = head.getNext();
        while (current != null) {
            if (current == node) return current;
            current = current.getNext();
        }
        return null;
    }

    public void removeNode(Node node) {
        if (head != null && head == node) {
            head = node;
            this.size--;
        } else {
            Node previous = head;
            Node current = head.getNext();
            while (current != null) {
                if (current == node) {
                    previous.setNext(current.getNext());
                    this.size--;
                    break;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
        }
    }
}
