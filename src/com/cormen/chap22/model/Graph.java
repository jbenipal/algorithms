package com.cormen.chap22.model;

import java.util.List;

public interface Graph
{
    Vertex addVertex();
    Edge addEdge(Vertex from, Vertex to, int weight);
    List<Vertex> getVertices();
    List<? extends Edge> getEdges();
    boolean hasVertex(Vertex v);
    boolean hasEdge(Edge e);
    List<Vertex> getNeighbours(Vertex v);
    List<? extends Edge> getNeighbourEdges(Vertex v);
    void removeEdge(Edge e);
    Graph cloneMe();
}