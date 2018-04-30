package com.cormen.chap22.model;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AdjacencyListTest
{
    @Test
    public void testInit()
    {
        AdjacencyList adjacencyList = new AdjacencyList();
        assertTrue(adjacencyList.adjacencyList_.size() == 0);
    }

    @Test
    public void testAddEdge()
    {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(v1, v2, 1);
        AdjacencyList adjacencyList = new AdjacencyList();
        adjacencyList.addEdge(v1,edge);

        List<Vertex> expectedNeighbours = new LinkedList<>();
        expectedNeighbours.add(v2);

        assertEquals(adjacencyList.getNeighbours(v1), expectedNeighbours, "Neighbours dont match");
        assertTrue(adjacencyList.getNeighbours(v2).isEmpty(), "V2 should be empty");
    }

    @Test
    public void testGetEdges()
    {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(v1, v2, 1);

        AdjacencyList adjacencyList = new AdjacencyList();
        adjacencyList.addEdge(v1, edge);

        Edge expectedEdge = new Edge(v1, v2, 1);
        assertEquals(adjacencyList.getEdges(v1).get(0), expectedEdge, "V1 should be empty");
    }

    @Test
    public void testRemoveEdge()
    {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(v1, v2, 1);
        AdjacencyList adjacencyList = new AdjacencyList();
        adjacencyList.addEdge(v1, edge);
        adjacencyList.removeEdge(v1, edge);

        assertTrue(adjacencyList.getNeighbours(v1).isEmpty(), "V1 should be empty");
        assertTrue(adjacencyList.getNeighbours(v2).isEmpty(), "V2 should be empty");
    }
}