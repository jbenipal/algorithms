package com.leetcode;

public class CoinChange
{
    public int coinChange(int[] coins, int amount)
    {
        if (amount == 0) return 0;
        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            if (coin < amount) {
                min = Math.min(min, coinChange(coins, amount - coin) + 1);
            }
        }
        return -1;
    }
}
