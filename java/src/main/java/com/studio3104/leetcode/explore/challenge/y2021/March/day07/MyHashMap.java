package com.studio3104.leetcode.explore.challenge.y2021.March.day07;

import java.util.Arrays;

class MyHashMap {
    /*
    Note:
    - All keys and values will be in the range of [0, 1000000].
    - The number of operations will be in the range of [1, 10000].
    - Please do not use the built-in HashMap library.
    */

    private final Integer[] array;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        array = new Integer[1_000_000];
        Arrays.fill(array, null);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        array[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return array[key] == null ? -1 : array[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        array[key] = null;
    }
}

/*
  Your MyHashMap object will be instantiated and called as such:
  MyHashMap obj = new MyHashMap();
  obj.put(key,value);
  int param_2 = obj.get(key);
  obj.remove(key);
 */
