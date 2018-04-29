package com.leetcode;

public class FlattenBinaryTree
{
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x)
        {
            val = x;
            left = right = null;
        }
    }
    public TreeNode flatten(TreeNode node)
    {
        return flatten(node, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode prev)
    {
        if (root == null)
        {
            return prev;
        }

        prev = flatten(root.right, prev);
        prev = flatten(root.left, prev);

        root.left = null;
        root.right = prev;
        return root;
    }
}