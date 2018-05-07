package com.leetcode;

import com.model.Node;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MiddleOfLinkedListTest
{
    @BeforeMethod
    public void setup()
    {
        middleOfLinkedList = new MiddleOfLinkedList();
        node1 = new Node<>(1);
        node2 = new Node<>(2);
        node3 = new Node<>(3);
        node4 = new Node<>(4);
        node5 = new Node<>(5);
    }

    @Test
    public void test1()
    {
        Node middle = middleOfLinkedList.findMiddle(node1);
        assertEquals(middle, node1, "Middle not as expected");
    }

    @Test
    public void test2()
    {
        node1.setNext(node2);
        Node middle = middleOfLinkedList.findMiddle(node1);
        assertEquals(middle, node1, "Middle not as expected");
    }

    @Test
    public void test3()
    {
        node1.setNext(node2);
        node2.setNext(node3);
        Node middle = middleOfLinkedList.findMiddle(node1);
        assertEquals(middle, node2, "Middle not as expected");
    }

    @Test
    public void test4()
    {
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        Node middle = middleOfLinkedList.findMiddle(node1);
        assertEquals(middle, node2, "Middle not as expected");
    }

    @Test
    public void test5()
    {
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Node middle = middleOfLinkedList.findMiddle(node1);
        assertEquals(middle, node3, "Middle not as expected");
    }

    private MiddleOfLinkedList middleOfLinkedList;
    private Node<Integer> node1;
    private Node<Integer> node2;
    private Node<Integer> node3;
    private Node<Integer> node4;
    private Node<Integer> node5;
}