package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimplifyPathTest
{
    @BeforeMethod
    public void setup()
    {
        simplifyPath_ = new SimplifyPath();
    }

    @Test
    public void test()
    {
        assertEquals(simplifyPath_.simplifyPath("/home/"), "/home");
        assertEquals(simplifyPath_.simplifyPath("/a/./b/../../c/"), "/c");
        assertEquals(simplifyPath_.simplifyPath("/home//foo/"), "/home/foo");
    }
    private SimplifyPath simplifyPath_;
}