package com.cormen.chap16;

public class Knapsack_01
{
    public int maximumProfit_DP(int[] values, int[] weights, int W)
    {
        if (W == 0)
        {
            return 0;
        }

        int[][] memo = new int[values.length + 1][W+1];
        return maximumProfit_DP(values, weights, W, values.length, memo);
    }

    private int maximumProfit_DP(int[] values, int[] weights, int W, int start, int[][] memo)
    {
        if (memo[start][W] > 0 || start == 0) return memo[start][W];

        if (weights[start-1] > W)
        {
            memo[start][W] = maximumProfit_DP(values, weights, W, start-1, memo);
        } else {
            memo[start][W] = Math.max(
                    maximumProfit_DP(values, weights, W - weights[start-1], start - 1, memo) + values[start-1],
                    maximumProfit_DP(values, weights, W, start - 1, memo));
        }

        return memo[start][W];
    }

    public int maximumProfit(int [] values, int weights[], int W, int start)
    {
        if (W == 0 || start == values.length)
        {
            return 0;
        }

        if (weights[start] > W)
        {
            return maximumProfit(values, weights, W, start+1);
        }

        return Math.max(
                maximumProfit(values, weights, W - weights[start], start +1) + values[start],
                maximumProfit(values, weights, W, start+1));
    }
}
