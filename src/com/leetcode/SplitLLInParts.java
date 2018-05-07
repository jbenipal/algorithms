package com.leetcode;

import com.model.Node;

class SplitLLInParts
{
    public Node<Integer>[] splitListToParts(Node<Integer> root, int k)
    {
        int len = len(root);
        int r = 0;
        int partLen = len/k;
        r = len%k;
        partLen = (r == 0) ? partLen : partLen+1;
        r = (r==0) ? k : r;

        Node<Integer>[] nodes = new Node[k];
        Node<Integer> node = root;

        for (int i=0; i<k && node !=null; ++i)
        {
            int j= 0;
            nodes[i] = node;
            Node<Integer> prev = null;
            while(j < partLen) {
                ++j;
                prev = node;
                node = node.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            if (i+1==r) {
                --partLen;
            }
        }

        return nodes;
    }

    private int len(Node<Integer> root)
    {
        int len = 0;
        while (root != null)
        {
            ++len;
            root = root.next;
        }

        return len;
    }
}