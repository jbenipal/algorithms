package com.cormen.chap22;

import com.cormen.chap22.model.Attributes.AttributeUtil;
import com.cormen.chap22.model.Graph;
import com.cormen.chap22.model.Vertex;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BFS
{
    public static Graph traverse(final Graph graph, Vertex source)
    {
        Graph bfs = graph.cloneMe();
        List<Vertex> vertices = bfs.getVertices();
        vertices.stream().forEach(vertex ->  {
            // TODO: find a better way to make attribute more generic
            vertex.attributes_.addAttribute(AttributeUtil.COLOR, AttributeUtil.WHITE);
            vertex.attributes_.addAttribute(AttributeUtil.PARENT, null);
            vertex.attributes_.addAttribute(AttributeUtil.DISTANCE, null);
        });

        Vertex startingVertex = null;
        for(Vertex vertex : vertices) {
            if (vertex.equals(source)) {
                startingVertex = vertex;
                break;
            }
        }
        startingVertex.attributes_.addAttribute(AttributeUtil.DISTANCE, String.valueOf(0));
        startingVertex.attributes_.addAttribute(AttributeUtil.COLOR, AttributeUtil.GREY);
        traverseInternal(bfs, startingVertex);
        return bfs;
    }

    private static void traverseInternal(Graph graph, Vertex source)
    {
        Queue<Vertex> queue = new ArrayDeque<>();
        queue.offer(source);

        while(!queue.isEmpty())
        {
            Vertex front  = queue.poll();

            graph.getNeighbourEdges(front).forEach(edge -> {
                Vertex vertex = edge.to_;
                if (unmarked(vertex))
                {
                    queue.offer(edge.to_);

                    int distanceSoFar = Integer.valueOf(front.attributes_.getAttribute(AttributeUtil.DISTANCE));
                    vertex.attributes_.addAttribute(AttributeUtil.COLOR, AttributeUtil.GREY);
                    vertex.attributes_.addAttribute(AttributeUtil.PARENT, String.valueOf(front.id_));
                    vertex.attributes_.addAttribute(AttributeUtil.DISTANCE, String.valueOf(distanceSoFar + edge.weight_));
                }
            });

            front.attributes_.addAttribute(AttributeUtil.COLOR, AttributeUtil.BLACK);
        }
    }

    private static boolean unmarked(Vertex vertex)
    {
        return vertex.attributes_.getAttribute(AttributeUtil.COLOR).equals(AttributeUtil.WHITE);
    }
}