package com.cormen.chap22;

import com.cormen.chap22.model.Graph;
import com.cormen.chap22.model.UndirectedGraph;
import com.cormen.chap22.model.Vertex;

import java.util.List;

public class GraphTranspose
{
    public static Graph getGraphTransposed(final Graph graph)
    {
        if (graph instanceof UndirectedGraph)
        {
            return transposeUndirectedGraph(graph);
        }
        return null;
    }

    private static UndirectedGraph transposeUndirectedGraph(final Graph graph)
    {
        UndirectedGraph undirectedGraph = new UndirectedGraph();
        graph.getVertices().forEach(vertex -> undirectedGraph.addVertex());

        //easier way
        //graph.getEdges().forEach(edge -> undirectedGraph.addEdge(edge.to_, edge.from_, edge.weight_));

        //harder way through adjacency list
        graph.getVertices().forEach(vertex -> {
            List<Vertex> neighbours = graph.getNeighbours(vertex);
            neighbours.forEach(neighbour -> undirectedGraph.addEdge(neighbour, vertex, 1));
        });

        return undirectedGraph;
    }
}