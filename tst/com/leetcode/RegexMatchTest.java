package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RegexMatchTest
{
    @BeforeMethod
    public void setup()
    {
        regexMatch_ = new RegexMatch();
    }

    @Test
    public void myTest()
    {
        String s1 = "mississippi";
        String p1 = "mis*is*p*.";

        String s2 = "aab";
        String p2 = "c*a*b";

        String s3 = "bbbba";
        String p3 = ".*a*a";

        String s4 = "aa";
        String p4 = "a*";

        String s5 = "a";
        String p5 = "ab*";

        String s6 = "ab";
        String p6 = ".*c";


        boolean isMatch1 = regexMatch_.isMatch(s1, p1);
        boolean isMatch2 = regexMatch_.isMatch(s2, p2);
        boolean isMatch3 = regexMatch_.isMatch(s3, p3);
        boolean isMatch4 = regexMatch_.isMatch(s4, p4);
        boolean isMatch5 = regexMatch_.isMatch(s5, p5);
        boolean isMatch6 = regexMatch_.isMatch(s6, p6);

        assertFalse(isMatch1, "Invalid Match1");
        assertTrue(isMatch2, "Invalid Match2");
        assertTrue(isMatch3, "Invalid Match3");
        assertTrue(isMatch4, "Invalid Match4");
        assertTrue(isMatch5, "Invalid Match5");
        assertFalse(isMatch6, "Invalid Match6");
    }

    private RegexMatch regexMatch_;
}