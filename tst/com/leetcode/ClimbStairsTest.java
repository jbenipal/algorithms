package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ClimbStairsTest
{
    @BeforeMethod
    public void setup()
    {
        climbStairs_ = new ClimbStairs();
    }

    @Test
     public void test()
    {
        assertEquals(climbStairs_.climbStairs(0), 0, "0 stairs do not match");
        assertEquals(climbStairs_.climbStairs(1), 1, "1 stairs do not match");
        assertEquals(climbStairs_.climbStairs(2), 2, "2 stairs do not match");
        assertEquals(climbStairs_.climbStairs(3), 3, "3 stairs do not match");
        assertEquals(climbStairs_.climbStairs(8), 34, "8 stairs do not match");
        assertEquals(climbStairs_.climbStairs(44), 1134903170, "44 stairs do not match");
    }
    ClimbStairs climbStairs_;
}