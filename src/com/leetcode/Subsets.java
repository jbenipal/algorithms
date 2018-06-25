package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets
{
    public List<List<Integer>> subsets(int[] nums)
    {
        if (nums.length == 0)
        {
            return new ArrayList<>();
        }

        List<List<Integer>> rv = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        rv.add(emptyList);

        subsets(nums, rv, 0);
        return rv;
    }

    private void subsets(int[] nums, List<List<Integer>> rv, int index)
    {
        if (index == nums.length) return;

        List<List<Integer>> currList = new ArrayList<>();

        for (List<Integer> list : rv)
        {
            List<Integer> newSubset = new ArrayList<>();
            newSubset.addAll(list);
            newSubset.add(nums[index]);
            currList.add(newSubset);
        }
        rv.addAll(currList);
        subsets(nums, rv, index + 1);
    }
}
