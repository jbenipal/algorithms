package com.leetcode;

public class ClimbStairs
{
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int[] memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;

        return climbStairs(n, memo);
    }

    private int climbStairs(int n, int[] memo)
    {
        if (n==0) return 0;

        for (int i = 3; i<=n; ++i)
        {
            memo[i] = memo[i-1] + memo[i-2];
        }

        return memo[n];
    }

    private int climbStairs1(int n, int[] memo)
    {
        if (n==0) return 0;
        if (memo[n] > 0) return memo[n];
        memo[n] =  climbStairs(n-1) + climbStairs(n-2);

        return memo[n];
    }
}
