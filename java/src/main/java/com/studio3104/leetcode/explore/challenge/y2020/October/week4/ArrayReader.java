package com.studio3104.leetcode.explore.challenge.y2020.October.week4;

interface IArrayReader {
    int get(int index);
}

class ArrayReader implements IArrayReader {
    private final int[] ARRAY;

    ArrayReader(int[] array) {
        ARRAY = array;
    }

    @Override
    public int get(int index) {
        return index >= 0 && index < ARRAY.length ? ARRAY[index] : Integer.MAX_VALUE;
    }
}