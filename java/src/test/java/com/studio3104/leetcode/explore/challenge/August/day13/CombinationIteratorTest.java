package com.studio3104.leetcode.explore.challenge.August.day13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CombinationIteratorTest {
    @Test
    void test() {
        CombinationIterator iterator = new CombinationIterator("abc", 2);

        Assertions.assertEquals("ab", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("ac", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("bc", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
