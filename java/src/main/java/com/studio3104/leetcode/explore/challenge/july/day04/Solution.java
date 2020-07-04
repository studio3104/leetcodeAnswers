package com.studio3104.leetcode.explore.challenge.july.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int nthUglyNumber(int n) {
        int[] coefficients = {2, 3, 5};
        int[] currentIndexes = {0, 0, 0};
        List<Integer> uglies = new ArrayList<>(Collections.singletonList(1));

        for (int i = 0; i < n - 1; i++) {
            List<Integer> temporary = new ArrayList<>();

            for (int j = 0; j < coefficients.length; j++) {
                temporary.add(coefficients[j] * uglies.get(currentIndexes[j]));
            }
            int minimumValue = temporary.stream().mapToInt(Integer::intValue).min().orElseThrow();
            uglies.add(minimumValue);

            for (int k = 0; k < coefficients.length; k++) {
                if (temporary.get(k) == minimumValue)
                    currentIndexes[k] += 1;
            }
        }

        return uglies.get(uglies.size() - 1);
    }
}
