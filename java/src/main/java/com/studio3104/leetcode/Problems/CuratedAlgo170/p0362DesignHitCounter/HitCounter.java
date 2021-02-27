package com.studio3104.leetcode.Problems.CuratedAlgo170.p0362DesignHitCounter;

import java.util.ArrayDeque;
import java.util.Queue;

class HitCounter {
    private final int DURATION = 300;
    private final Queue<Integer> q;

    /** Initialize your data structure here. */
    public HitCounter() {
        q = new ArrayDeque<>();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        q.add(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (!q.isEmpty() && DURATION <= timestamp - q.peek()) {
            q.remove();
        }
        return q.size();
    }
}
