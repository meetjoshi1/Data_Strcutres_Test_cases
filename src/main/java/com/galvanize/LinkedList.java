package com.galvanize;

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
public class LinkedList {

    public Node node;

    public boolean isEmpty(){
        return node == null;
    }

    public void addNode(Node node1){
        if(isEmpty()){
            node = node1;
        }
        else
        {
            node1.setNext(node);
            node = node1;
        }
    }

    public Node getHead(){
        return node;
    }

    public int count(){
        Node nodeIterator = node;
        int count = 0;
        while (nodeIterator != null){
            count++;
            nodeIterator = nodeIterator.getNext();
        }
        return count;
    }

    public Node find(Node node1){
        Node nodeIterator = node;
        while (nodeIterator != null){
            if(nodeIterator.equals(node1))
                return node1;
            nodeIterator = nodeIterator.getNext();
        }
        return null;
    }

    public void removeNode(Node node1) {

        Node nodeIterator = node;
        while (nodeIterator != null) {
            if (nodeIterator.equals(node1)) {
                node.setNext(node.getNext().getNext());
                return;
            }
            nodeIterator = nodeIterator.getNext();
        }


    }
}
