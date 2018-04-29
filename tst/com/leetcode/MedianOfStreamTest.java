package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;

import static org.testng.Assert.assertEquals;

public class MedianOfStreamTest
{
    @BeforeMethod
    public void setup()
    {
        Comparator<Integer> maxComparator = Comparator.reverseOrder();
        Comparator<Integer> minComparator = Comparator.naturalOrder();

        medianOfStream_ = new MedianOfStream(minComparator, maxComparator);
    }

    @Test
    public void test()
    {
        medianOfStream_.addItem(1);
        assertEquals(medianOfStream_.findMedian(), 1.0, "Median1 not as expected");
        medianOfStream_.addItem(2);
        assertEquals(medianOfStream_.findMedian(), 1.5, "Median2 not as expected");
        medianOfStream_.addItem(3);
        assertEquals(medianOfStream_.findMedian(), 2.0, "Median3 not as expected");
    }

    @Test
    public void testReverse()
    {
        medianOfStream_.addItem(-1);
        assertEquals(medianOfStream_.findMedian(), -1.0, "Median1 reverse not as expected");
        medianOfStream_.addItem(-2);
        assertEquals(medianOfStream_.findMedian(), -1.5, "Median2 reverse not as expected");
        medianOfStream_.addItem(-3);
        assertEquals(medianOfStream_.findMedian(), -2.0, "Median3 reverse not as expected");
    }

    private MedianOfStream medianOfStream_;
}