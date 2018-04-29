package com.cormen.chap9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OrderStatisticsTest {
    @BeforeMethod
    public void setup() throws Exception
    {
        orderStatistics_ = new OrderStatistics();
    }

    @Test
    public void test()
    {
        for (int i =0;i <100; ++i) {
            int[] a1 = {3, 2, 1, 5, 6, 4};
            assertEquals(orderStatistics_.nthOrder(a1, 2), 2, "2nd smallest not as expected");

            int[] a2 = {3, 2, 1, 5, 6, 4};
            assertEquals(orderStatistics_.nthOrder(a2, 1), 1, "1st smallest not as expected");

            int[] a3 = {3, 2, 1, 5, 6, 4};
            assertEquals(orderStatistics_.nthOrder(a3, 6), 6, "6th smallest not as expected");

            int[] a4 = {-3, -2, -1, -5, -1006, -904};
            assertEquals(orderStatistics_.nthOrder(a4, 2), -904, "2nd smallest not as expected");
        }
    }

    private OrderStatistics orderStatistics_;
}