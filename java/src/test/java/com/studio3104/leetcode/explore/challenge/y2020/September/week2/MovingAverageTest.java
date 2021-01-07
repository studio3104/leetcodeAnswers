package com.studio3104.leetcode.explore.challenge.y2020.September.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovingAverageTest {
    @Test
    void next() {
        MovingAverage m = new MovingAverage(3);
        Assertions.assertEquals(1, m.next(1));
        Assertions.assertEquals((double) (1 + 10) / 2, m.next(10));
        Assertions.assertEquals((double) (1 + 10 + 3) / 3, m.next(3));
        Assertions.assertEquals((double) (10 + 3 + 5) / 3, m.next(5));
    }
}
