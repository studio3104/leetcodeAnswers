package com.studio3104.leetcode.explore.challenge.y2020.October.day01;

import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {
    private final int DURATION = 3000;
    Deque<Integer> requests;

    public RecentCounter() {
        requests = new ArrayDeque<>();
    }

    public int ping(int t) {
        while (!requests.isEmpty()) {
            if (requests.peekFirst() < t - DURATION) requests.pollFirst();
            else break;
        }
        requests.add(t);
        return requests.size();
    }
}

/*
  Your RecentCounter object will be instantiated and called as such:
  RecentCounter obj = new RecentCounter();
  int param_1 = obj.ping(t);
 */
