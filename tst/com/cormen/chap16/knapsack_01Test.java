package com.cormen.chap16;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class knapsack_01Test
{
    @BeforeMethod
    public void setup()
    {
        knapsack_01_ = new Knapsack_01();
    }

    @Test
    public void test1()
    {
        long startTime = System.currentTimeMillis();
        int[] values = {60,100,120};
        int[] weights = {10,20,30};

        assertEquals(knapsack_01_.maximumProfit(values, weights, 50, 0), 220, "Maximum profit not as expected");
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime));
    }

    @Test
    public void test1_DP()
    {
        long startTime = System.currentTimeMillis();
        int[] values = {60,100,120};
        int[] weights = {10,20,30};

        assertEquals(knapsack_01_.maximumProfit_DP(values, weights, 50), 220, "Maximum profit not as expected");
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time DP: " + (endTime - startTime));
    }

    @Test
    public void test_combines()
    {
        int[] values = {92,57,49,68,60,43,67,84,87,72};
        int[] weights = {23,31,29,44,53,38,63,85,89,82};

        long startTime = System.currentTimeMillis();
        assertEquals(knapsack_01_.maximumProfit_DP(values, weights, 165), 309, "Maximum profit not as expected");
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time DP: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        assertEquals(knapsack_01_.maximumProfit(values, weights, 165, 0), 309, "Maximum profit not as expected");
        endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime));
    }

    @Test
    public void test2()
    {
        int[] values = {8,5,4};
        int[] weights = {9,5,4};

        assertEquals(knapsack_01_.maximumProfit(values, weights, 12, 0), 9, "Maximum profit not as expected");
    }

    private Knapsack_01 knapsack_01_;
}