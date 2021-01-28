package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int size = 0;
    private Vertex vertex;

    public void addVertex(Vertex vertex){
        this.vertex = vertex;
        size++;
    }

    public int size(){
        return size;
    }

    public void addEdge(Vertex city1, Vertex city2, int distance ){

    }

    public boolean isConnected(Vertex city1, Vertex city2){
        return true;
    }

    public List<Vertex> getPathTo (Vertex city1, Vertex city2){
        List<Vertex> ListOfVertex = new ArrayList<Vertex>();

        return ListOfVertex;

    }
}
