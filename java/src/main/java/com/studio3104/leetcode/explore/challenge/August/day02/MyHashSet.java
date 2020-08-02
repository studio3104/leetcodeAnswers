package com.studio3104.leetcode.explore.challenge.August.day02;

import java.util.LinkedList;

class MyHashSet {
    int prime = 769;
    Bucket[] buckets;

    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new Bucket[prime];
        for (int i = 0; i < prime; ++i) buckets[i] = new Bucket();
    }

    public void add(int key) {
        buckets[key % prime].insert(key);
    }

    public void remove(int key) {
        buckets[key % prime].delete(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return buckets[key % prime].exists(key);
    }
}

class Bucket {
    LinkedList<Integer> container = new LinkedList<>();

    public void insert(Integer key) {
        int index = container.indexOf(key);
        if (index == -1) container.addFirst(key);
    }

    public void delete(Integer key) {
        container.remove(key);
    }

    public boolean exists(Integer key) {
        int index = container.indexOf(key);
        return index != -1;
    }
}
