package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class NParenthesisTest
{
    @BeforeMethod
    public void setup()
    {
        nParenthesis_ = new NParenthesis();
    }

    @Test
    public void test()
    {
        List<String> n1 = new ArrayList<>();
        n1.add("()");

        List<String> n2 = new ArrayList<>();
        n2.add("()()");
        n2.add("(())");

        List<String> n3 = new ArrayList<>();
        n3.add("()()()");
        n3.add("((()))");
        n3.add("(()())");
        n3.add("(())()");
        n3.add("()(())");

        List<String> n1Actual = nParenthesis_.generateParenthsis(1);
        List<String> n2Actual = nParenthesis_.generateParenthsis(2);
        List<String> n3Actual = nParenthesis_.generateParenthsis(3);

        assertTrue(n1Actual.containsAll(n1) && n1.containsAll(n1Actual), "1 does not match");
        assertTrue(n2Actual.containsAll(n2) && n2.containsAll(n2Actual), "2 does not match");
        assertTrue(n3Actual.containsAll(n3) && n3.containsAll(n3Actual), "3 does not match");
    }

    private NParenthesis nParenthesis_;
}