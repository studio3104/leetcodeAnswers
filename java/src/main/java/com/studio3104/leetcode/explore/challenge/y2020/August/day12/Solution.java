package com.studio3104.leetcode.explore.challenge.y2020.August.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int k = 1; k <= rowIndex; ++k) {
            int val = (int) (row.get(row.size() - 1) * (long) (rowIndex - k + 1) / k);
            row.add(val);
        }
        return row;
    }
}
