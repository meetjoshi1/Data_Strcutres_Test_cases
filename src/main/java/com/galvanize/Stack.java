package com.galvanize;

public class Stack {
    public boolean empty;
    public Node top;
    private int size;

    public Stack() {
        this.empty = true;
        this.size = 0;
    }

    public int count() {
        return size;
    }

    public void push(Node item) {
        if (top == null) {
            top = item;
            this.empty = false;
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
