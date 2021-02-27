package com.studio3104.leetcode.Problems.CuratedAlgo170.p0362DesignHitCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HitCounterTest {

    @Test
    void testHitCounter() {
        HitCounter counter = new HitCounter();

        // hit at timestamp 1.
        counter.hit(1);

        // hit at timestamp 2.
        counter.hit(2);

        // hit at timestamp 3.
        counter.hit(3);

        // get hits at timestamp 4, should return 3.
        Assertions.assertEquals(3, counter.getHits(4));

        // hit at timestamp 300.
        counter.hit(300);

        // get hits at timestamp 300, should return 4.
        Assertions.assertEquals(4, counter.getHits(300));

        // get hits at timestamp 301, should return 3.
        Assertions.assertEquals(3, counter.getHits(301));
    }
}