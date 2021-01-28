package com.galvanize;

import java.util.Objects;

/*
    Node

    Nodes are the individual units contained in a data structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
public class Node {

    private Object value;

    private Node next;

    public Node(Object value){
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(getValue(), node.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
