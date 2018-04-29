package com.leetcode;

import com.model.AnswerNotFoundException;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStream
{
    public MedianOfStream(Comparator<Integer> minComparator, Comparator<Integer> maxComparator)
    {
        minHeap_ = new PriorityQueue(minComparator);
        maxHeap_ = new PriorityQueue(maxComparator);
    }

    public void addItem(int item)
    {
        if (minHeap_.size() == 0 && maxHeap_.size() == 0){
            minHeap_.add(item);
        } else if (minHeap_.size() > maxHeap_.size()) {
            if (minHeap_.peek() < item) {
                maxHeap_.add(minHeap_.poll());
                minHeap_.add(item);
            } else {
                maxHeap_.add(item);
            }
        } else if (maxHeap_.size() > minHeap_.size()) {
            if (maxHeap_.peek() > item) {
                minHeap_.add(maxHeap_.poll());
                maxHeap_.add(item);
            } else {
                minHeap_.add(item);
            }
        } else {
            if (item < maxHeap_.peek()) {
                maxHeap_.add(item);
            } else {
                minHeap_.add(item);
            }
        }
    }

    public double findMedian()
    {
        if (minHeap_.size() == 0) {
            throw new AnswerNotFoundException("No element read from stream");
        }
        if (minHeap_.size() > maxHeap_.size()) {
            return minHeap_.peek();
        } else if (maxHeap_.size() > minHeap_.size()) {
            return maxHeap_.peek();
        } else {
            return (minHeap_.peek() + maxHeap_.peek())/2.0;
        }
    }

    private PriorityQueue<Integer> minHeap_;
    private PriorityQueue<Integer> maxHeap_;
}