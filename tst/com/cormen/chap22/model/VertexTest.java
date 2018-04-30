package com.cormen.chap22.model;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class VertexTest
{
    @Test
    public void test()
    {
        Vertex vertex = new Vertex(1);
        assertTrue(vertex.id_ == 1, "Vertex id not as expected");
    }

    @Test
    public void testEquality()
    {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(1);
        assertEquals(vertex1, vertex1, "Vertex [1,1] do not match");
        assertEquals(vertex1, vertex2, "Vertex [1,2] do not match");
        assertEquals(vertex2, vertex2, "Vertex [2.2] do not match");
    }

    @Test
    public void testInEquality()
    {
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        assertNotEquals(vertex1, vertex2, "Vertex [1,2] match");
    }
}