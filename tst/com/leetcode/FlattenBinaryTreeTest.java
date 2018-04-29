package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.leetcode.FlattenBinaryTree.TreeNode;
import static org.testng.Assert.*;

public class FlattenBinaryTreeTest
{
    @BeforeMethod
    public void setup()
    {
        flattenBinaryTree_ = new FlattenBinaryTree();
        treeNode1 = flattenBinaryTree_.new TreeNode(1);
        treeNode2 = flattenBinaryTree_.new TreeNode(2);
        treeNode3 = flattenBinaryTree_.new TreeNode(3);
        treeNode4 = flattenBinaryTree_.new TreeNode(4);
        treeNode5 = flattenBinaryTree_.new TreeNode(5);
        treeNode6 = flattenBinaryTree_.new TreeNode(6);

        /*
                 1
               2    5
             3   4    6
       */
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode5;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        treeNode5.right = treeNode6;
    }

    @Test
    public void test()
    {
        TreeNode root = flattenBinaryTree_.flatten(treeNode1);

        while(root != null)
        {
            System.out.print(root.val + "->");
            root = root.right;
        }
    }

    private FlattenBinaryTree flattenBinaryTree_;
    private TreeNode treeNode1;
    private TreeNode treeNode2;
    private TreeNode treeNode3;
    private TreeNode treeNode4;
    private TreeNode treeNode5;
    private TreeNode treeNode6;
}