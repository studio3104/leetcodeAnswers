package com.studio3104.leetcode.explore.challenge.y2020.October.week4;

public class Solution {
    public int search(ArrayReader reader, int target) {
        int head = 0, tail = (int) Math.pow(10, 4) - 1;

        while (head <= tail) {
            int pivot = head + (tail - head) / 2;
            int val = reader.get(pivot);

            if (val == target) return pivot;

            if (val < target) head = pivot + 1;
            else tail = pivot - 1;
        }

        return -1;
    }
}
