package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_436
{
    public class Interval
    {
        private int start;
        private int end;

        public Interval(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }

    public class IntervalMetadata
    {
        Interval interval;
        int index;

        public IntervalMetadata(final Interval interval, int index)
        {
            this.interval = new Interval(interval.start, interval.end);
            this.index = index;
        }
    }

    public int[] findRightInterval(final Interval[] intervals)
    {
        List<IntervalMetadata> sorted = IntStream.range(0, intervals.length)
                .mapToObj(i -> new IntervalMetadata(intervals[i], i))
                .collect(Collectors.toList());

        Collections.sort(sorted, (intervalMetadata1, intervalMetadata2) -> {
            return intervalMetadata1.interval.start - intervalMetadata2.interval.start;
        });

        return Arrays.stream(intervals)
                .mapToInt(interval -> binarySearch(sorted, interval.end, 0, sorted.size()-1))
                .toArray();
    }

    private int binarySearch(final List<IntervalMetadata> intervalMetadata, int value, int start, int end)
    {
        if (start > end) return -1;

        int mid = start + (end - start)/2;
        if (intervalMetadata.get(mid).interval.start >= value)
        {
            if (mid == 0 || (mid >= 1 && intervalMetadata.get(mid-1).interval.start < value))
            {
                return intervalMetadata.get(mid).index;
            } else {
                return binarySearch(intervalMetadata, value, start, mid-1);
            }
        } else {
            return binarySearch(intervalMetadata, value, mid +1, end);
        }
    }
}