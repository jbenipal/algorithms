package com.cormen.chap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IntervalPartitioning
{
    public class Interval
    {
        private int startTime;
        private int endTime;
        private String name;

        public Interval(int s, int e, String name)
        {
            startTime = s;
            endTime = e;
            this.name = name;
        }

        public int endTime()
        {
            return endTime;
        }

        public int startTime()
        {
            return startTime;
        }

        public String name()
        {
            return name;
        }
    }

    public List<String> getOptimal(Interval[] intervals)
    {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(Interval::startTime));
        Map<Integer, List<Interval>> partitions = new HashMap<>();

        int k = 1;
        List<Interval> list = new LinkedList<>();
        list.add(intervals[0]);
        partitions.put(1, list);
        return Collections.emptyList();
    }
}
