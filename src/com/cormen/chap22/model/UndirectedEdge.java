package com.cormen.chap22.model;

public class UndirectedEdge extends Edge
{
    public UndirectedEdge(Vertex from, Vertex to, int weight)
    {
        super(from, to, weight);
    }

    public UndirectedEdge(Vertex from, Vertex to)
    {
        this(from, to, 1);
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this) {
            return true;
        }

        if (!(o instanceof UndirectedEdge)) {
            return false;
        }

        UndirectedEdge other = (UndirectedEdge) o;
        // not compare weights
        if ((other.from_ == this.from_ && other.to_ == this.to_) ||
            (other.to_ == this.from_ && other.from_ == this.to_)) {
            return true;
        } else {
            return false;
        }
    }
}