package com.studio3104.leetcode.explore.challenge.y2020.August.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashSetTest {
    MyHashSet hashSet = new MyHashSet();

    @Test
    void testMyHashSet() {
        hashSet.add(1);
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(1));    // returns true
        Assertions.assertFalse(hashSet.contains(3));   // returns false (not found)
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(2));    // returns true
        hashSet.remove(2);
        Assertions.assertFalse(hashSet.contains(2));   // returns false (already removed)
    }
}
