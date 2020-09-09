package com.studio3104.leetcode.explore.challenge.September.week2;

import java.util.ArrayDeque;
import java.util.Deque;

class MovingAverage {
    private static int capacity, currentSum;
    private static Deque<Integer> deque;

    public MovingAverage(int size) {
        capacity = size;
        currentSum = 0;
        deque = new ArrayDeque<>();
    }

    public double next(int val) {
        if (capacity <= 0) return 0;
        currentSum += val;
        deque.addLast(val);
        if (deque.size() > capacity && deque.peekFirst() != null) currentSum -= deque.pollFirst();
        return (double) currentSum / deque.size();
    }
}
