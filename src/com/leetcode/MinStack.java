package com.leetcode;

import java.util.Stack;

public class MinStack
{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x)
    {
        if (minStack.empty() || minStack.peek() >= x) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public int pop()
    {
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
        return top;
    }

    public int peek()
    {
        return stack.peek();
    }

    public int getMin()
    {
        return minStack.peek();
    }
}
