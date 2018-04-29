package com.util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class BitArrayTest
{
    @BeforeMethod
    public void setup() throws Exception
    {
        bitArray_ = new BitArray(200);
    }

    @Test
    public void test()
    {
        assertFalse(bitArray_.isSet(14), "Should be false");
        bitArray_.set(14, true);
        assertTrue(bitArray_.isSet(14), "Should be true");
        bitArray_.set(14, false);
        assertFalse(bitArray_.isSet(14), "Should be false again");

        // greater than word size
        assertFalse(bitArray_.isSet(147), "Should be false");
        bitArray_.set(147, true);
        assertTrue(bitArray_.isSet(147), "Should be true");
        bitArray_.set(147, false);
        assertFalse(bitArray_.isSet(147), "Should be false again");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test2()
    {
        bitArray_.isSet(201);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test3()
    {
        bitArray_.set(201, false);
    }

    private BitArray bitArray_;
}