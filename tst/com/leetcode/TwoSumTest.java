package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoSumTest
{
    @BeforeMethod
    public void setup()
    {
        twoSum_ = new TwoSum();
    }

    @Test
    public void test()
    {
        int[] a = {2,7,11,15};
        int[] output = twoSum_.twoSum(a, 9);

        assertEquals(output[0], 0);
        assertEquals(output[1], 1);
    }

    private TwoSum twoSum_;
}