package com.cormen.chap22.model;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Collections;

public class AdjacencyList
{
    public Map<Vertex, List<Edge>> adjacencyList_;

    public AdjacencyList()
    {
        adjacencyList_ = new HashMap<>();
    }

    public void addEdge(Vertex from, Edge e)
    {
        if (adjacencyList_.containsKey(from))
        {
            adjacencyList_.get(from).add(0, e);
        } else {
            List<Edge> edges = new LinkedList<>();
            edges.add(e);
            adjacencyList_.put(from, edges);
        }
    }

    public void removeEdge(Vertex from, Edge e)
    {
        if (adjacencyList_.containsKey(from))
        {
            adjacencyList_.get(from).remove(e);
        }
    }

    public List<Vertex> getNeighbours(Vertex vertex)
    {
        if (!adjacencyList_.containsKey(vertex))
        {
            return Collections.emptyList();
        } else {
            List<Edge> edgeList = adjacencyList_.get(vertex);
            List<Vertex> neighbors = new LinkedList<>();

            edgeList.forEach(edge -> neighbors.add(edge.to_));
            return neighbors;
        }
    }

    public List<Edge> getEdges(Vertex vertex)
    {
        if (!adjacencyList_.containsKey(vertex))
        {
            return Collections.emptyList();
        } else {
            return adjacencyList_.get(vertex);
        }
    }
}