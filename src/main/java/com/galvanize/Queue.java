package com.galvanize;

public class Queue {
    private int size;
    private Node front;
    private Node rear;

    public Queue() {
        this.size = 0;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return this.size;
    }

    public void enqueue(Node node) {
        if (front == null) {
            front = node;
            rear = node;
        }
        rear.setNext(node);
        rear = node;
        this.size++;
    }

    public Node dequeue() {
        Node first = front;
        front = first.getNext();
        return first;
    }

    public Node peek() {
        return front;
    }
}
