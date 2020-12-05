package com.studio3104.leetcode.explore.challenge.December.day05;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; ++i) {
            if (flowerbed[i] == 1) {
                ++i;
                continue;
            }

            if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                --n;
                flowerbed[i++] = 1;
            }

            if (n == 0) {
                return true;
            }
        }

        return false;
    }
}
