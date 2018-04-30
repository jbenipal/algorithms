package com.cormen.chap22.model;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class UndirectedGraphTest
{
    @BeforeMethod
    public void setup()
    {
        graph_ = new UndirectedGraph();
    }

    @Test
    public void graphInit()
    {
        assertTrue(graph_.vertices_.isEmpty(), "Vertex set should be empty");
        assertTrue(graph_.edges_.isEmpty(), "Edge set should be empty");
    }

    @Test
    public void graphAddVertex()
    {
        Vertex v1 = graph_.addVertex();
        assertTrue(graph_.getVertices().size() == 1, "Vertex set should be 1");
        assertTrue(graph_.hasVertex(v1), "Vertex should be there");
        assertTrue(v1.id_ == 1, "Id should start from 1");
        assertTrue(graph_.getEdges().isEmpty(), "Edge set should be empty");
    }

    @Test
    public void graphAddEdge()
    {
        Vertex v1 = graph_.addVertex();
        Vertex v2 = graph_.addVertex();
        Vertex v3 = graph_.addVertex();

        Edge e1 = graph_.addEdge(v1, v2, 1);
        Edge e2 = graph_.addEdge(v1, v3, 1);
        Edge expectedEdge1 = new Edge(v1, v2, 1);
        Edge expectedEdge2 = new Edge(v1, v3, 1);
        assertTrue(graph_.getVertices().size() == 3, "Vertex set should be 3");
        assertTrue(graph_.getEdges().size() == 4, "Edge set should be 4");
        assertTrue(graph_.hasVertex(v1), "Vertex should be there");
        assertTrue(graph_.hasEdge(e1), "Edge should be there");
        assertEquals(e1, expectedEdge1, "Edge does  not match");
        assertEquals(e2, expectedEdge2, "Edge does  not match");
    }

    @Test
    public void removeEdge()
    {
        Vertex v1 = graph_.addVertex();
        Vertex v2 = graph_.addVertex();

        Edge e1 = graph_.addEdge(v1, v2, 1);
        graph_.removeEdge(e1);

        assertTrue(graph_.getVertices().size() == 2, "Vertex set should be 1");
        assertTrue(graph_.getEdges().size() == 0, "Edge set should be 0");

        assertTrue(graph_.hasVertex(v1), "Vertex should be there");
        assertFalse(graph_.hasEdge(e1), "Edge should not be there");
    }

    @Test
    public void graphGetNeighbours()
    {
        Vertex v1 = graph_.addVertex();
        Vertex v2 = graph_.addVertex();
        Vertex v3 = graph_.addVertex();

        Edge e1 = graph_.addEdge(v1, v2, 1);
        Edge e2 = graph_.addEdge(v1, v3, 1);

        List<Vertex> expectedNeighbours = new LinkedList<>();
        expectedNeighbours.add(v2);
        expectedNeighbours.add(v3);
        List<Vertex> actualNeighbours = graph_.getNeighbours(v1);

        assertTrue(actualNeighbours.size() == expectedNeighbours.size()
                            && actualNeighbours.containsAll(expectedNeighbours), "Neighbours do not match");
        expectedNeighbours.clear();
        expectedNeighbours.add(v1);
        actualNeighbours = graph_.getNeighbours(v2);

        assertTrue(actualNeighbours.size() == expectedNeighbours.size()
                && actualNeighbours.containsAll(expectedNeighbours), "Neighbours do not match");


        actualNeighbours = graph_.getNeighbours(v3);

        assertTrue(actualNeighbours.size() == expectedNeighbours.size()
                && actualNeighbours.containsAll(expectedNeighbours), "Neighbours do not match");
    }

    @Test
    public void graphGetNeighbours2()
    {
        Vertex v1 = graph_.addVertex();
        Vertex v2 = graph_.addVertex();

        Edge e1 = graph_.addEdge(v1, v2, 1);

        List<Vertex> vertexList = new LinkedList<>();
        vertexList.add(v2);

        assertEquals(graph_.getNeighbours(v1), vertexList, "Neighbours do not match");
        graph_.removeEdge(e1);
        assertTrue(graph_.getNeighbours(v1).isEmpty(), "Neighbours should be empty");
    }

    private UndirectedGraph graph_;
}