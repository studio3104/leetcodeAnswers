package com.studio3104.leetcode.explore.challenge.y2021.March.day26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    private int[] countChar(String S) {
        int[] counter = new int[26];
        for (char c: S.toCharArray()) {
            ++counter[c - 'a'];
        }
        return counter;
    }

    private boolean isSubset(int[] aCount, int[] bMax) {
        for (int i = 0; i < 26; ++i) {
            if (aCount[i] < bMax[i]) {
                return false;
            }
        }
        return true;
    }

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bMax = countChar("");
        for (String b: B) {
            int[] bCount = countChar(b);
            for (int i = 0; i < 26; ++i) {
                bMax[i] = Math.max(bMax[i], bCount[i]);
            }
        }

        return Arrays.stream(A)
                .filter(s -> isSubset(countChar(s), bMax))
                .collect(Collectors.toList());
    }
}
