package com.studio3104.leetcode.explore.challenge.y2021.February.day18;

class Solution {
    private int countSlices(int n) {
        int sum = 0;
        for (int i = n; i >= 3; --i) {
            sum += n - i + 1;
        }
        return sum;
    }

    public int numberOfArithmeticSlices(int[] A) {
        Integer prev = null;
        Integer diff = null;
        int consecutive = 0;
        int num = 0;

        for (int n : A) {
            if (prev == null) {
                prev = n;
                continue;
            }
            if (diff == null) {
                diff = Math.abs(n - prev);
                prev = n;
                consecutive = 2;
                continue;
            }
            if (diff != Math.abs(n - prev)) {
                num += countSlices(consecutive);
                prev = n;
                diff = null;
                consecutive = 1;
                continue;
            }
            prev = n;
            ++consecutive;
        }

        return num + countSlices(consecutive);
    }
}
