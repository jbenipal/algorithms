package com.cormen.chap15;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LCSTest
{
    @BeforeMethod
    public void setup()
    {
        lcs_ = new LCS();
    }

    @Test
    public void test()
    {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";

        assertEquals(lcs_.lcs(s1, s2), 4, "LCS does not match");
    }

    @Test
    public void test2()
    {
        String s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
        String s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";

        String s3= "GTCGTCGGAAGCCGGCCGAA";

        assertEquals(lcs_.lcs(s1, s2), s3.length(), "LCS does not match");
    }

    private LCS lcs_;
}