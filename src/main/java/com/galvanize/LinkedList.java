/*
  Linked List

  A linked list is a data structure that stores data sequentially by
  linking each item in the list to the next. It has the following properties:

  - head: the first item in the list
  - tail (optional) : last item in the list

  It's made up of items called Nodes, which contain 2 pieces of information:

  - value: any type or you can restrict to specific types
  - next: a reference to the next item in the list

  Nodes are usually added to the end of the list. Operations include:

  - Add node
  - Remove node
  - Find a node
  For example, suppose you have a LinkedList of numbers. It might look
  like so:

  * [] represents the 'value' attribute
  * -> represents the 'next' attribute
  * Together, []-> represents a Node

                    [100]-> [200]-> [300]-> null

  The Node with value 100 is the head. The Node with value 300 is the
  tail. Note how the tail points to nothing. Therefore null signifies
  the end of the list.
 */
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
