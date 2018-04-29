package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class AnalogCutMachineTest
{
    @BeforeMethod
    public void setup()
    {
        analogCutMachine_ = new AnalogCutMachine();
    }

    @Test
    public void test()
    {
        int len = 100;
        int[] cuts = {25,50,75};

        int len2 = 10;
        int[] cuts2 = {4, 5, 7, 8};

        int len3 = 10;
        int[] cuts3 = {2, 4, 7};

        int minCost = analogCutMachine_.minCost(len, cuts);
        assertEquals(minCost, 200, "Cost does not match");

        int minCost2 = analogCutMachine_.minCost(len2, cuts2);
        assertEquals(minCost2, 22, "Cost does not match");

        int minCost3 = analogCutMachine_.minCost(len3, cuts3);
        assertEquals(minCost3, 20, "Cost does not match");
    }

    private AnalogCutMachine analogCutMachine_;
}