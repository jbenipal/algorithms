package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 Problem 1
 */

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap();

        for (int i=0; i<nums.length; ++i)
        {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
