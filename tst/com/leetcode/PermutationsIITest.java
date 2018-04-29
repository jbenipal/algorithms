package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PermutationsIITest
{
    @BeforeMethod
    public void setup()
    {
        permutationsII_ = new PermutationsII();
    }

    @Test
    public void test()
    {
        int[] a = {3,1,2,1};
        List<List<Integer>> output = permutationsII_.getPermutations(a);

        output.forEach(permutation -> {
            permutation.forEach(i -> System.out.print(i + ","));
            System.out.println();
        });
    }

    PermutationsII permutationsII_;
}