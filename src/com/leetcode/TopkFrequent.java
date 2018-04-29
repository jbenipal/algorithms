package com.leetcode;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TopkFrequent
{
    public static class Frequency
    {
        int data;
        int frequency;
    }

    public List<Integer> topKFrequent(int[] nums, int k)
    {
        frequencyHeap_ = new PriorityQueue<>((element1, element2) ->
                Integer.compare(element2.frequency, element1.frequency)
        );

        Map<Integer, Frequency> queueMap = new HashMap<>();
        for (int num : nums)
        {
            if (queueMap.containsKey(num)) {
                Frequency frequency = queueMap.get(num);
                frequency.frequency++;
                queueMap.put(num, frequency);
            } else {
                Frequency frequency = new Frequency();
                frequency.frequency = 1;
                frequency.data = num;
                queueMap.put(num, frequency);
            }
        }

        queueMap.forEach((key, value) -> {
            frequencyHeap_.add(value);
        });

        List<Integer> topK = new LinkedList<>();
        while (!frequencyHeap_.isEmpty() && k>0)
        {
            topK.add(frequencyHeap_.poll().data);
            --k;
        }

        return topK;
    }

    private PriorityQueue<Frequency> frequencyHeap_;
}
