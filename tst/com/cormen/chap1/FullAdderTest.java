package com.cormen.chap1;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FullAdderTest
{
    @Test
    public void testAddTwoBinaryArrays() throws Exception
    {
        int[] a = {1,1,0};
        int[] b = {0,1,1};

        int[] c = FullAdder.addTwoBinaryArrays(a, b);
        System.out.println(Arrays.toString(c));
    }
}