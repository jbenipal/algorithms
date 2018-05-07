package com.leetcode;

import com.model.Node;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OddEvenTest
{
    @BeforeMethod
    public void setup()
    {
        oddEven = new OddEven();
    }

    @Test
    public void test()
    {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head = oddEven.oddEvenList(node1);

        while (head != null)
        {
            System.out.print(head.item + "->");
            head = head.next;
        }
    }

    OddEven oddEven;
}