package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    public List<Node> node = new ArrayList();

    public boolean isEmpty(){
        return node.isEmpty();
    }

    public void push(Node node1){
        this.node.add(node1);
    }

    public int count(){
        return node.size();
    }

    public Node pop(){
        Node removeNode = node.get(node.size() -1);
        node.remove(removeNode);
        return removeNode;
    }

    public Node peek(){
        return node.get(node.size() -1 );
    }

}
