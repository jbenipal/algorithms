package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class WordSearchTest
{
    @BeforeMethod
    public void setup()
    {
        wordSearch = new WordSearch();
    }

    @Test
    public void testContains()
    {
        String str = "SEE";
        assertTrue(wordSearch.exist(board, str));
    }

    @Test
    public void testContains2()
    {
        String str = "SEED";
        assertTrue(wordSearch.exist(board, str));
    }

    @Test
    public void testPartialContains()
    {
        String str = "SEEN";
        assertFalse(wordSearch.exist(board, str));
    }

    @Test
    public void testDoesNotContains()
    {
        String str = "FAN";
        assertFalse(wordSearch.exist(board, str));
    }

    private WordSearch wordSearch;
    private char[][] board = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };
}