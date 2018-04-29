package com.cormen.chap1;

public class FullAdder
{
    public static int[] addTwoBinaryArrays(int[] a, int[] b)
    {
        int[] c = new int[a.length + 1];
        int n = a.length;

        int carry = 0;
        for (int i=0; i < n; ++i)
        {
            c[i] = a[i] ^ b[i] ^ carry;
            carry = (a[i] & b[i]) | (carry & (a[i] ^ b[i]));
        }
        c[n] = carry;
        return c;
    }
}