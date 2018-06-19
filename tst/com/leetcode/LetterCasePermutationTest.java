package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LetterCasePermutationTest
{
    @BeforeMethod
    public void setup()
    {
        letterCasePermutation = new LetterCasePermutation();
    }

    @Test
    public void testWithAlphaNumeric()
    {
        String s = "a1b2";
        List<String> expected = new ArrayList<>();
        expected.add(s);
        expected.add("a1B2");
        expected.add("A1b2");
        expected.add("A1B2");
        List<String> actual = letterCasePermutation.letterCasePermutation(s);
        assertEquals(actual.size(), expected.size());
        assertTrue(actual.containsAll(expected));
    }

    @Test
    public void testWithDigits()
    {
        String s = "1234";
        List<String> expected = new ArrayList<>();
        expected.add(s);
        List<String> actual = letterCasePermutation.letterCasePermutation(s);
        assertEquals(actual.size(), expected.size());
        assertTrue(actual.containsAll(expected));
    }

    private LetterCasePermutation letterCasePermutation;
}