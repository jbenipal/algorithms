package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchInRotatedSortedTest
{
    @BeforeMethod
    public void setup()
    {
        searchInRotatedSorted_ = new SearchInRotatedSorted();
    }

    @Test
    public void test()
    {
        int[] a1 = {4,5,6,7,0,1,2};

        int index_1 = searchInRotatedSorted_.search(a1, 0);
        int index_2 = searchInRotatedSorted_.search(a1, 3);

        assertEquals(index_1, 4, "Index_1 does not match");
        assertEquals(index_2, -1, "Index_2 does not match");
    }

    private SearchInRotatedSorted searchInRotatedSorted_;
}