package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinMissingPositiveTest
{
    @BeforeMethod
    public void setup()
    {
        minMissingPositive_ = new MinMissingPositive();
    }

    @Test
    public void test() throws Exception
    {
        int[] a1 = {0,1,2};
        int res1 = minMissingPositive_.minMissingPositive(a1);
        assertEquals(res1, 3, "a1 not as expected");

        int[] a2 = {3,4,-1,1};
        int res2 = minMissingPositive_.minMissingPositive(a2);
        assertEquals(res2, 2, "a2 not as expected");

        int[] a3 = {3,4,2,-1,1};
        int res3 = minMissingPositive_.minMissingPositive(a3);
        assertEquals(res3, 5, "a3 not as expected");

        int[] a4 = {1,2,3};
        int res4 = minMissingPositive_.minMissingPositive(a4);
        assertEquals(res4, 4, "a4 not as expected");

        int[] a5 = {7,8,9,10,11};
        int res5 = minMissingPositive_.minMissingPositive(a5);
        assertEquals(res5, 1, "a5 not as expected");
    }

    private MinMissingPositive minMissingPositive_;
}