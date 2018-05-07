package com.leetcode;

import com.model.Node;

public class MiddleOfLinkedList
{
    public <E>
    Node findMiddle(Node<E> node)
    {
        if (node == null) {
            return node;
        }

        Node slow = node;
        Node fast = node.getNext();

        while (fast != null && fast.getNext() != null)
        {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }
}