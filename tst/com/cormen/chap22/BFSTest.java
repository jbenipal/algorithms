package com.cormen.chap22;

import com.cormen.chap22.model.Attributes;
import com.cormen.chap22.model.Edge;
import com.cormen.chap22.model.Graph;
import com.cormen.chap22.model.UndirectedGraph;
import com.cormen.chap22.model.Vertex;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class BFSTest
{
    @BeforeMethod
    public void setup()
    {
        graph_ = new UndirectedGraph();
        v1 = graph_.addVertex();
        v2 = graph_.addVertex();
        v3 = graph_.addVertex();
        v4 = graph_.addVertex();
        v5 = graph_.addVertex();
        v6 = graph_.addVertex();

        Edge e1 = graph_.addEdge(v1, v2, 1);
        Edge e2 = graph_.addEdge(v1, v3, 1);
        Edge e3 = graph_.addEdge(v3, v4, 1);
        Edge e4 = graph_.addEdge(v4, v5, 1);
    }

    @Test
    public void test()
    {
        Graph graph = BFS.traverse(graph_, v1);
        List<Vertex> vertexList = graph.getVertices();

        vertexList.forEach(vertex -> {
            System.out.println("Vertex ID: " + vertex.id_);
            int distance = vertex.attributes_.getAttribute(Attributes.AttributeUtil.DISTANCE) == null
                    ? Integer.MAX_VALUE
                    : Integer.valueOf(vertex.attributes_.getAttribute(Attributes.AttributeUtil.DISTANCE));
            System.out.println("Vertex Distance: " +  distance);
            System.out.println("Vertex Color: " +  vertex.attributes_.getAttribute(Attributes.AttributeUtil.COLOR));
        });
    }

    private Graph graph_;
    private Vertex v1;
    private Vertex v2;
    private Vertex v3;
    private Vertex v4;
    private Vertex v5;
    private Vertex v6;
}