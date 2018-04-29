package com.cormen.chap5;

import org.testng.annotations.Test;

public class RandomABTest
{
    @Test
    public void testRandomAB()
    {
        RandomAB randomAB = new RandomAB();
        int random = randomAB.random(4,9);
        System.out.println("Random Number:" + random);
    }
}