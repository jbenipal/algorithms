package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StrStrTest
{
    @BeforeMethod
    public void setup()
    {
        strStr = new StrStr();
    }

    @Test
    public void test()
    {
        String haystack = "hello";
        String needle = "ll";

        assertEquals(strStr.strStr(haystack, needle), 2);
    }

    private StrStr strStr;
}