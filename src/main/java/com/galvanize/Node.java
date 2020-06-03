/*
    Node

    Nodes are the individual units contained in a data structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
package com.galvanize;

import java.util.Objects;

public class Node {
    public Object value;
    private Node next;

    public Node(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(getValue(), node.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
