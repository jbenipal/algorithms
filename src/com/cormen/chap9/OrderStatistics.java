package com.cormen.chap9;

import com.model.AnswerNotFoundException;
import java.util.concurrent.ThreadLocalRandom;

public class OrderStatistics
{
    public int nthOrder(int[] nums, int n)
    {
        if (nums.length < n) {
            throw new AnswerNotFoundException();
        }

        return nthOrder(nums, n, 0, nums.length-1);
    }

    private int nthOrder(int[] nums, int n, int start, int end)
    {
        int pivot = findPivot(nums, start, end);
        int k = pivot-start+1;
        if (k == n) {
            return nums[pivot];
        } else {
            if (k < n) {
                return nthOrder(nums, n-k, pivot+1, end);
            } else {
                return nthOrder(nums, n, start, pivot-1);
            }
        }
    }

    private int findPivot(int[] nums, int start, int end)
    {
        int randomIndex = ThreadLocalRandom.current().nextInt(start, end+1);
        swap(nums, randomIndex, start);

        int pivot = start;
        int key = nums[start];
        ++start;
        while (start <= end)
        {
            if (nums[start] < key)
            {
                swap(nums, start, pivot++);
                ++start;
            } else {
                swap(nums, start, end);
                --end;
            }
        }

        return pivot;
    }

    private void swap(final int[] n, int i, int j)
    {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}