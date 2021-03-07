package com.studio3104.leetcode.explore.challenge.y2021.March.day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

class Bucket {
    private final List<Pair<Integer, Integer>> bucket;

    public Bucket() {
        bucket = new LinkedList<>();
    }

    public Integer get(Integer key) {
        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                return pair.second;
            }
        }
        return -1;
    }

    public void update(Integer key, Integer value) {
        boolean found = false;
        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                pair.second = value;
                found = true;
            }
        }
        if (!found) {
            bucket.add(new Pair<>(key, value));
        }
    }

    public void remove(Integer key) {
        for (Pair<Integer, Integer> pair : bucket) {
            if (pair.first.equals(key)) {
                bucket.remove(pair);
                break;
            }
        }
    }
}

class MyHashMap {
    private final int keySpace;
    private final List<Bucket> bucketList;

    public MyHashMap() {
        keySpace = 2069;
        bucketList = new ArrayList<>();
        for (int i = 0; i < keySpace; ++i) {
            bucketList.add(new Bucket());
        }
    }

    public void put(int key, int value) {
        int hashKey = key % keySpace;
        bucketList.get(hashKey).update(key, value);
    }

    public int get(int key) {
        int hashKey = key % keySpace;
        return bucketList.get(hashKey).get(key);
    }

    public void remove(int key) {
        int hashKey = key % keySpace;
        bucketList.get(hashKey).remove(key);
    }
}
