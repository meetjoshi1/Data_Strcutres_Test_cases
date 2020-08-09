package com.galvanize;

import java.util.HashMap;

public class Vertex implements AbstractNode {
    public Object value;
    public HashMap relations;

    public Vertex(Object value) {
        this.value = value;
        this.relations = new HashMap();
    }

    public void addRelation(Vertex vertex, Object weight) {
        relations.putIfAbsent(vertex, weight);
    }

    public boolean isConnected(Vertex v) {
        return relations.containsKey(v);
    }
}
