package com.model;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class NodeTest
{
    @Test
    public void test()
    {
        Node<Integer> node1 = new Node<>(5);
        Node<Integer> node2 = new Node<>(6);
        assertTrue(node1.getNext() == null, "Next should be null");
        assertTrue(node1.getItem() == 5, "Item not as expected");

        node1.setNext(node2);
        assertTrue(node1.getNext() == node2, "Next should be node2");
    }
}