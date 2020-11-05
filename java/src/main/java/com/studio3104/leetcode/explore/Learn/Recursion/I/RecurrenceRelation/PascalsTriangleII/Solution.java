package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> getRow(int targetLevel, int currentLevel, List<Integer> currentRow) {
        if (currentLevel == targetLevel) {
            return currentRow;
        }

        int nextLevel = ++currentLevel;
        List<Integer> nextRow = new ArrayList<>() {{
            add(1);
        }};

        for (int i = 1; i < nextLevel; ++i) {
            nextRow.add(currentRow.get(i - 1) + currentRow.get(i));
        }

        nextRow.add(1);
        return getRow(targetLevel, nextLevel, nextRow);
    }

    public List<Integer> getRow(int rowIndex) {
        return getRow(rowIndex, 0, new ArrayList<>() {{
            add(1);
        }});
    }
}
