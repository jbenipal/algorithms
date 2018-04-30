package com.cormen.chap22.model;

public class Edge
{
    public final Vertex from_;
    public final Vertex to_;
    public final int weight_;
    public Attributes attributes_;

    public Edge(Vertex from, Vertex to, int weight)
    {
        from_ = from;
        to_ = to;
        weight_ = weight;
        attributes_ = new Attributes();
    }

    public Edge(Vertex from, Vertex to)
    {
        this(from, to, 1);
    }

    public Edge reverse()
    {
        return new Edge(to_, from_, weight_);
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Edge)) {
            return false;
        }

        Edge other = (Edge) o;
        // not compare weights
        if (other.from_==this.from_ && other.to_==this.to_) {
            return true;
        } else {
            return false;
        }
    }
}
