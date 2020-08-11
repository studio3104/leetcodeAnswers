package com.studio3104.leetcode.explore.challenge.August.day11;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int l = citations.length;
        for (int i = l; i > 0; --i) {
            if (citations[l - i] >= i) return i;
        }
        return 0;
    }
}
