package com.leetcode;

import com.model.Node;

class OddEven
{
    public Node<Integer> oddEvenList(Node<Integer> head)
    {
        if (head == null) return head;

        Node<Integer> odd, even, oddRunner, evenRunner;
        odd = head;
        even = head.next;
        oddRunner = odd;
        evenRunner = even;

        while(evenRunner != null)
        {
            oddRunner.next = evenRunner.next;
            if (oddRunner.next != null)
            {
                oddRunner = oddRunner.next;
                if (oddRunner != null)
                {
                    evenRunner.next = oddRunner.next;
                }
            }
            evenRunner = evenRunner.next;
        }
        oddRunner.next =  even;

        return odd;
    }
}