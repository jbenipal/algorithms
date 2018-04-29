package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReverseKNodeTest
{
    @BeforeMethod
    public void setup()
    {
        reverseKNode_ = new ReverseKNode();
    }

    @Test
    public void test()
    {
        ReverseKNode.ListNode head = createList();

        ReverseKNode.ListNode runner = head;
        while (runner != null)
        {
            System.out.print(runner.val + "->");
            runner = runner.next;
        }
        System.out.println("X");

        ReverseKNode.ListNode newHead = reverseKNode_.reverseKGroup(head, 3);
        runner = newHead;
        while (runner != null)
        {
            System.out.print(runner.val + "->");
            runner = runner.next;
        }
        System.out.println("X");
    }

    ReverseKNode.ListNode createList()
    {
        ReverseKNode.ListNode node1 = reverseKNode_.new ListNode(1);
        ReverseKNode.ListNode node2 = reverseKNode_.new ListNode(2);
        ReverseKNode.ListNode node3 = reverseKNode_.new ListNode(3);
        ReverseKNode.ListNode node4 = reverseKNode_.new ListNode(4);
        ReverseKNode.ListNode node5 = reverseKNode_.new ListNode(5);
        ReverseKNode.ListNode node6 = reverseKNode_.new ListNode(6);
        ReverseKNode.ListNode node7 = reverseKNode_.new ListNode(7);
        ReverseKNode.ListNode node8 = reverseKNode_.new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;


        return node1;
    }

    ReverseKNode reverseKNode_;
}