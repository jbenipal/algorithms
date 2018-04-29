package com.util;

import java.util.Arrays;

/*
  Custom Bit Array to store boolean values efficiently
 */
public class BitArray
{
    private int[] bitArray_;
    private final int size_;
    private final int WORD_SIZE = 0x20; //32

    public BitArray(int n) throws Exception
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("BitArray size Invalid");
        }

        size_ = n;
        // Initialize size of array
        int internalArraySize = size_/WORD_SIZE + (size_%WORD_SIZE == 0 ? 0 : 1);
        bitArray_ = new int[internalArraySize];
        Arrays.fill(bitArray_, 0);
    }

    public void set(int n, boolean val)
    {
        if (n <0 || n > size_)
        {
            throw new IllegalArgumentException("Invalid Index");
        }
        int index = n / WORD_SIZE;
        int pos = n%WORD_SIZE;
        if (val) {
            bitArray_[index] |= 1 << pos;
        } else {
            bitArray_[index] &= ~(1 << pos);
        }
    }

    public boolean isSet(int n)
    {
        if (n <0 || n > size_)
        {
            throw new IllegalArgumentException("Invalid Index");
        }
        int index = n / WORD_SIZE;
        int pos = n%WORD_SIZE;
        return (bitArray_[index] & (0 | 1 << pos)) > 0;
    }
}