package com.cormen.chap22.model;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class EdgeTest
{
    @Test
    public void testSimpleEdge()
    {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(v1, v2);
        assertEquals(edge.from_, v1, "From Vertex id not as expected");
        assertEquals(edge.to_, v2, "To Vertex id not as expected");
        assertEquals(edge.weight_, 1, "Weight not as expected");
    }

    @Test
    public void testWeightedEdge()
    {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Edge edge = new Edge(v1, v2, 5);
        assertEquals(edge.from_, v1, "From Vertex id not as expected");
        assertEquals(edge.to_, v2, "To Vertex id not as expected");
        assertEquals(edge.weight_, 5, "Weight not as expected");
    }

    @Test
    public void testEquality()
    {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);

        Edge edge1 = new Edge(vertex1, vertex2);
        Edge edge2 = new Edge(vertex1, vertex2);
        assertEquals(edge1, edge2, "Edge do not match");
    }

    @Test
    public void testInEquality()
    {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);

        Edge edge1 = new Edge(vertex1, vertex2);
        Edge edge2 = new Edge(vertex1, vertex3);
        assertNotEquals(edge1, edge2, "Edge match");
    }

    @Test
    public void testReverse()
    {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);

        Edge edge1 = new Edge(vertex1, vertex2);
        Edge edge2 = new Edge(vertex2, vertex1);
        assertEquals(edge1.reverse(), edge2, "Reverse Edge does not match");
    }
}