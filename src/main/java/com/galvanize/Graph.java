package com.galvanize;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<Vertex, ArrayList> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        vertices.putIfAbsent(v, new ArrayList());
    }

    public int size() {
        return vertices.size();
    }

    public void addEdge(Vertex v1, Vertex v2, Object weight) {
        ArrayList v1rel = vertices.get(v1);
        ArrayList v2rel = vertices.get(v2);
        v1rel.add(v2);
        v2rel.add(v1);
        vertices.put(v1, v1rel);
        vertices.put(v2, v2rel);
        v1.addRelation(v2, weight);
        v2.addRelation(v1, weight);
    }

    public boolean isConnected(Vertex v1, Vertex v2) {
        return vertices.get(v1).contains(v2);
    }

    public ArrayList getPathTo(Vertex destination, Vertex origin) {
        ArrayList path = new ArrayList();
        Queue queue = new Queue();

        // Get all vertices into the queue
        // Check
        return path;
    }
}
