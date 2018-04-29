package com.leetcode;

public class RemoveDuplicates
{
    public int removeDuplicates(int[] nums)
    {
        int j = 1;
        int currIndex = 1;
        while (j < nums.length)
        {
            if (nums[j] != nums[j-1])
            {
                nums[currIndex++] = nums[j];
            }
            ++j;
        }
        return currIndex;
    }
}
