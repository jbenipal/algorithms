package com.leetcode;

import com.util.BitArray;

public class MinMissingPositive
{
    public int minMissingPositive(int[] nums) throws Exception
    {
        int len = nums.length;
        BitArray bitArray = new BitArray(len+1);

        for (int num: nums) {
            if (num <= len && num > 0) {
                bitArray.set(num, true);
            }
        }
        for (int i=1; i<=len; ++i) {
            if (!bitArray.isSet(i)) {
                return i;
            }
        }
        return len+1;
    }
}
