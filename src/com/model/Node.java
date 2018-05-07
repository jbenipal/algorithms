package com.model;

public class Node<E>
{
    private E item;
    private Node<E> next;

    public Node(E item)
    {
        this.item = item;
        next = null;
    }

    public void setNext(Node<E> next)
    {
        this.next = next;
    }

    public E getItem()
    {
        return item;
    }

    public Node<E> getNext()
    {
        return next;
    }

    @Override
    public String toString()
    {
        return "" + item;
    }
}