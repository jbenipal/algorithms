package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PermutationsITest
{
    @BeforeMethod
    public void setup()
    {
        permutationsI_ = new PermutationsI();
    }

    @Test
    public void test()
    {
        int[] a = {3,4,5};
        List<List<Integer>> output = permutationsI_.getPermutations(a);

        output.forEach(permutation -> {
            permutation.forEach(i -> System.out.print(i + ","));
            System.out.println();
        });
    }

    PermutationsI permutationsI_;
}