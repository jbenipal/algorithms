package com.leetcode;

public class SearchInRotatedSorted
{
    public int search(int[] nums, int target) {
        return searchRotated(nums, target, 0, nums.length-1);
    }

    private int searchRotated(int[] nums, int target, int start, int end)
    {
        if (start > end) {
            return -1;
        }
        int mid = (start + end)/2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target < nums[mid]) {
                return searchRotated(nums, target, start, mid-1);
            } else {
                return searchRotated(nums, target, mid+1, end);
            }
        }
        if (nums[mid] <= nums[end]) {
            if (target > nums[mid] && target <= nums[end]) {
                return searchRotated(nums, target, mid+1, end);
            }
        }
        return searchRotated(nums, target, start, mid-1);
    }
}
