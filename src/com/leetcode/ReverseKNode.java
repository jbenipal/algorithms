package com.leetcode;

class ReverseKNode
{
    public class ListNode
    {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0)
        {
            return head;
        }
        ListNode prev = null;
        ListNode currNode = head;
        ListNode newHead = null;
        while(true)
        {
            ListNode k_node = getK(currNode, k);
            if (k_node == null)
            {
                if (newHead == null)
                {
                    newHead = head;
                }
                break;
            } else {
                if (newHead == null)
                {
                    newHead = k_node;
                }
                reverseList(currNode, k_node, prev);
                prev = currNode;
                currNode = currNode.next;
            }
        }
        return newHead;
    }

    private ListNode getK(ListNode node, int k)
    {
        while (node != null && k>1)
        {
            node = node.next;
            --k;
        }
        return node;
    }

    private void reverseList(ListNode start, ListNode end, ListNode prev)
    {
        ListNode runningPrev = null;
        ListNode runningNode = start;
        ListNode lastNode = end.next;

        while (runningNode != lastNode)
        {
            ListNode next = runningNode.next;
            runningNode.next = runningPrev;
            runningPrev = runningNode;
            runningNode = next;
        }
        start.next = runningNode;
        if (prev != null) {
            prev.next = end;
        }
    }
}