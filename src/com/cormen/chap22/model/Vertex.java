package com.cormen.chap22.model;

public class Vertex
{
    public final int id_;
    public Attributes attributes_;

    public Vertex(final int id)
    {
        id_ = id;
        attributes_ = new Attributes();
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Vertex)) {
            return false;
        }

        Vertex other = (Vertex) o;
        if (other.id_ == this.id_) {
            return true;
        } else {
            return false;
        }
    }
}