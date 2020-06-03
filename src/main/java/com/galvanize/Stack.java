package com.galvanize;

public class Stack {
    public Node top;
    private int size;

    public Stack() {
        this.size = 0;
    }

    public int count() {
        return size;
    }

    public boolean isEmpty() {
        return this.count() == 0;
    }

    public void push(Node item) {
        if (top == null) {
            top = item;
        } else {
            item.setNext(top);
            top = item;
        }
        this.size++;
    }

    public Node pop() {
        Node current = top;
        top = current.getNext();
        current.setNext(new Node(null));
        this.size--;
        return current;
    }

    public Node peek() {
        return top;
    }
}
