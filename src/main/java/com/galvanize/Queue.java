package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Node> node = new ArrayList<>();

    public boolean isEmpty(){
        return node.isEmpty();
    }

    public void enqueue(Node node1){
        this.node.add(node1);
    }

    public int length(){
        return node.size();
    }

    public Node getFront(){
        return node.get(0);
    }

    public Node getRear(){
        return node.get(node.size() - 1);
    }

    public Node dequeue(){
        Node removeNode = this.getFront();
        node.remove(this.getFront());
        return removeNode;
    }



}
