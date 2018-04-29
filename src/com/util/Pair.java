package com.util;

import java.io.Serializable;

public class Pair<K extends Comparable, V extends Comparable> implements Serializable
{
    private K _first;
    private V _second;

    public Pair(K first, V second) {
        _first = first;
        _second = second;
    }

    public K first() {
        return _first;
    }

    public V second() {
        return _second;
    }

    @Override
    public String toString()
    {
        return _first + "," + _second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Pair) {
            Pair pair = (Pair) o;
            if (_first != null ? !_first.equals(pair.first()) : pair.first() != null) return false;
            if (_second != null ? !_second.equals(pair.second()) : pair.second() != null) return false;
            return true;
        }
        return false;
    }
}