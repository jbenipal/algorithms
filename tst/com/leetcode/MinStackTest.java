package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinStackTest
{
    @BeforeMethod
    public void setup()
    {
        minStack = new MinStack();
    }

    @Test
    public void test()
    {
        minStack.push(5);
        assertTrue(minStack.getMin() == 5, "Min not as expected");

        minStack.push(3);
        assertTrue(minStack.getMin() == 3, "Min not as expected");

        minStack.push(56);
        assertTrue(minStack.getMin() == 3, "Min not as expected");

        assertTrue(minStack.pop() == 56, "Pop operation not as expected");
        assertTrue(minStack.getMin() == 3, "Min not as expected");
        assertTrue(minStack.pop() == 3, "Pop operation not as expected");
        assertTrue(minStack.getMin() == 5, "Min not as expected");
    }

    private MinStack minStack;
}