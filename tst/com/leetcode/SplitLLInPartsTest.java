package com.leetcode;

import com.model.Node;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SplitLLInPartsTest
{
    @BeforeMethod
    public void setup()
    {
        splitLLInParts = new SplitLLInParts();
    }

    @Test
    public void test()
    {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node[] nodes = splitLLInParts.splitListToParts(node1, 5);
        Arrays.stream(nodes).forEach(node -> {
            while (node != null) {
                System.out.print(node.item + "->");
                node = node.next;
            }
            System.out.println();
        });
    }

    @Test
    public void test2()
    {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.setNext(node5);

        Node[] nodes = splitLLInParts.splitListToParts(node1, 5);
        Arrays.stream(nodes).forEach(node -> {
            while (node != null) {
                System.out.print(node.item + "->");
                node = node.next;
            }
            System.out.println();
        });
    }

    @Test
    public void test3()
    {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.setNext(node5);

        Node[] nodes = splitLLInParts.splitListToParts(node1, 3);
        Arrays.stream(nodes).forEach(node -> {
            while (node != null) {
                System.out.print(node.item + "->");
                node = node.next;
            }
            System.out.println();
        });
    }

    private SplitLLInParts splitLLInParts;
}