package com.studio3104.leetcode.explore.challenge.y2020.December.day10;

class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;

        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            ++i;
        }

        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            ++i;
        }

        return i == arr.length - 1;
    }
}
