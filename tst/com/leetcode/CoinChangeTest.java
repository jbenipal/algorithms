package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CoinChangeTest
{
    @BeforeMethod
    public void setup()
    {
        coinChange_ = new CoinChange();
    }

    @Test
    public void test()
    {
        int coins[] = {1,2,5};
        //assertEquals(coinChange_.coinChange(coins, 11), 3);
    }

    private CoinChange coinChange_;
}