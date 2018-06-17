package com.leetcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Problem_436Test
{
    @BeforeMethod
    public void setup()
    {
        problem_436 = new Problem_436();
    }

    @Test
    public void testGetMinimumIntervalsWithOneInterval()
    {
        List<Problem_436.Interval> intervals = new ArrayList<>();
        intervals.add(problem_436.new Interval(1,2));

        int[] rv = problem_436.findRightInterval(intervals);
        assertTrue(rv.length == 1);
        assertEquals(rv[0], -1);
    }

    @Test
    public void testGetMinimumIntervalsWithMultipleIntervals1()
    {
        List<Problem_436.Interval> intervals = new ArrayList<>();
        intervals.add(problem_436.new Interval(3,4));
        intervals.add(problem_436.new Interval(2,3));
        intervals.add(problem_436.new Interval(1,2));


        int[] rv = problem_436.findRightInterval(intervals);
        assertTrue(rv.length == 3);
        assertEquals(rv[0], -1);
        assertEquals(rv[1], 0);
        assertEquals(rv[2], 1);
    }

    @Test
    public void testGetMinimumIntervalsWithMultipleIntervals2()
    {
        List<Problem_436.Interval> intervals = new ArrayList<>();
        intervals.add(problem_436.new Interval(1,4));
        intervals.add(problem_436.new Interval(2,3));
        intervals.add(problem_436.new Interval(3,4));


        int[] rv = problem_436.findRightInterval(intervals);
        assertTrue(rv.length == 3);
        assertEquals(rv[0], -1);
        assertEquals(rv[1], 2);
        assertEquals(rv[2], -1);
    }

    private Problem_436 problem_436;
}