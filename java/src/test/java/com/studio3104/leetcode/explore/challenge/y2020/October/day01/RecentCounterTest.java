package com.studio3104.leetcode.explore.challenge.y2020.October.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecentCounterTest {
    @Test
    void ping() {
        RecentCounter recentCounter = new RecentCounter();
        Assertions.assertEquals(1, recentCounter.ping(1));     // requests = [1], range is [-2999,1], return 1
        Assertions.assertEquals(2, recentCounter.ping(100));   // requests = [1, 100], range is [-2900,100], return 2
        Assertions.assertEquals(3, recentCounter.ping(3001));  // requests = [1, 100, 3001], range is [1,3001], return 3
        Assertions.assertEquals(3, recentCounter.ping(3002));  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
    }
}
