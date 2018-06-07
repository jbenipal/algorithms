package com.cormen.chap22.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UndirectedGraph implements Graph
{
    // generate vertex ids
    private int vertex_index = 0;
    public List<Vertex> vertices_;
    public List<UndirectedEdge> edges_;
    public AdjacencyList adjacencyList_;

    public UndirectedGraph()
    {
        vertex_index = 0;
        vertices_ = new ArrayList<>();
        edges_ = new ArrayList<>();
        adjacencyList_ = new AdjacencyList();
    }

    @Override
    public Vertex addVertex()
    {
        synchronized (this) {
            vertex_index++;
        }
        Vertex vertex = new Vertex(vertex_index);
        vertices_.add(vertex);

        return vertex;
    }

    @Override
    public Edge addEdge(Vertex from, Vertex to, int weight)
    {
        UndirectedEdge edge = new UndirectedEdge(from, to, weight);

        synchronized (this) {
            edges_.add(edge);
            adjacencyList_.addEdge(from, edge);
            adjacencyList_.addEdge(to, edge.reverse());
        }

        return edge;
    }

    @Override
    public List<Vertex> getNeighbours(Vertex v)
    {
        return adjacencyList_.getNeighbours(v);
    }

    @Override
    public List<? extends Edge> getNeighbourEdges(Vertex v)
    {
        return adjacencyList_.getEdges(v);
    }

    @Override
    public void removeEdge(Edge e)
    {
        synchronized (this) {
            adjacencyList_.removeEdge(e.from_, e);
            adjacencyList_.removeEdge(e.to_, e.reverse());
            edges_.remove(e);
        }
    }

    @Override
    public List<Vertex> getVertices()
    {
        return vertices_;
    }

    @Override
    public List<? extends Edge> getEdges()
    {
        return edges_;
    }

    @Override
    public boolean hasVertex(Vertex v)
    {
        return getVertices().contains(v);
    }

    @Override
    public boolean hasEdge(Edge e)
    {
        return getEdges().contains(e);
    }

    @Override
    public Graph cloneMe()
    {
        UndirectedGraph clone = new UndirectedGraph();
        vertices_.forEach(vertex -> clone.addVertex());

        vertices_.forEach(vertex -> {
            List<Vertex> neighbours = getNeighbours(vertex);
            neighbours.forEach(neighbour -> {
                //UndirectedEdge edge = new UndirectedEdge();
            });
        });
        getUniqueEdges().forEach(edge -> {
            Edge edge1 = new Edge(edge.from_, edge.to_, edge.weight_);
            clone.addEdge(edge.from_, edge.to_, edge.weight_);
        });

        return clone;
    }

    private List<Edge> getUniqueEdges()
    {
        return edges_.stream().distinct().collect(Collectors.toList());
    }
}