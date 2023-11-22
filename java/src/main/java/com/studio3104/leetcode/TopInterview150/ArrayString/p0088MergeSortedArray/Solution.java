package com.studio3104.leetcode.TopInterview150.ArrayString.p0088MergeSortedArray;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] result = new int[m + n];

        for (int p = 0; p < m + n; ++p) {
            int n1 = Integer.MAX_VALUE;
            int n2 = Integer.MAX_VALUE;

            if (p1 < m) {
                n1 = nums1[p1];
            }
            if (p2 < n) {
                n2 = nums2[p2];
            }

            if (n1 < n2) {
                result[p] = n1;
                ++p1;
            } else {
                result[p] = n2;
                ++p2;
            }
        }

        if (m + n >= 0) System.arraycopy(result, 0, nums1, 0, m + n);
    }
}
