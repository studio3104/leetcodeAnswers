package com.studio3104.leetcode.explore.challenge.November.day16;

class Solution {
    public int longestMountain(int[] A) {
        int longest = 0;

        for (int i = 1; i < A.length - 1; ++i) {
            if (A[i + 1] >= A[i] || A[i] <= A[i - 1]) {
                continue;
            }

            int left = i;
            int right = i;

            while (left > 0 && A[left] > A[left - 1]) --left;
            while (right + 1 < A.length && A[right] > A[right + 1]) ++right;

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
