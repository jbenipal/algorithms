package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveDuplicatesTest
{
    @BeforeMethod
    public void setup()
    {
        removeDuplicates_ = new RemoveDuplicates();
    }

    @Test
    public void test()
    {
        int[] a1 = {1,1,2};
        int[] a2 = {0,0,1,1,1,2,2,3,3,4};

        assertEquals(removeDuplicates_.removeDuplicates(a1), 2, "Failed for a1");
        assertEquals(removeDuplicates_.removeDuplicates(a2), 5, "Failed for a2");
    }

    private RemoveDuplicates removeDuplicates_;
}