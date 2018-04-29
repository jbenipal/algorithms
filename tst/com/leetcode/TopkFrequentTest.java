package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class TopkFrequentTest
{
    @BeforeMethod
    public void setup()
    {
        topkFrequent_ = new TopkFrequent();
    }

    @Test
    public void test()
    {
        int[] a = {5,7,8,5,4,7,5};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(7);

        List<Integer> actual = topkFrequent_.topKFrequent(a,2);
        assertTrue(actual.size() == expected.size() && actual.containsAll(expected), "Top k not as expected");
    }

    private TopkFrequent topkFrequent_;
}