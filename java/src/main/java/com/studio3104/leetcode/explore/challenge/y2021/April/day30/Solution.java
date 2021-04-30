package com.studio3104.leetcode.explore.challenge.y2021.April.day30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    private int getPowerBound(int n, int bound) {
        return n == 1 ? bound : (int) (Math.log(bound) / Math.log(n));
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int n = getPowerBound(x, bound);
        int m = getPowerBound(y, bound);
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int v = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (v <= bound) {
                    result.add(v);
                }

                if (y == 1) {
                    break;
                }
            }

            if (x == 1) {
                break;
            }
        }

        return new ArrayList<>(result);
    }
}
