package com.cormen.chap15;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinMatrixChainMultiplicationsTest
{
    @BeforeMethod
    public void setup()
    {
        minMatrixChainMultiplications_ = new MinMatrixChainMultiplications();
    }

    @Test
    public void test()
    {
        int[]p = {10,100,5,50};
        int cost = minMatrixChainMultiplications_.minMultiplications(p);

        assertEquals(cost, 7500, "Min multiplications not as expected");

        int[] p2 = {30,35,15,5,10,20,25};
        int cost2 = minMatrixChainMultiplications_.minMultiplications(p2);

        assertEquals(cost2, 15125, "Min multiplications not as expected");
    }

    @Test
    public void testRecursive()
    {
        int[]p = {10,100,5,50};
        int cost = minMatrixChainMultiplications_.minMultiplicationsRecursive(p);

        assertEquals(cost, 7500, "Min multiplications not as expected");

        int[] p2 = {30,35,15,5,10,20,25};
        int cost2 = minMatrixChainMultiplications_.minMultiplicationsRecursive(p2);

        assertEquals(cost2, 15125, "Min multiplications not as expected");
    }

    MinMatrixChainMultiplications minMatrixChainMultiplications_;
}