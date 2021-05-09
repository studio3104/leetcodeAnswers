package com.studio3104.leetcode.explore.challenge.y2021.May.week2;

import java.util.Arrays;

class Solution {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        int limitSoFar = warehouse[0];
        for (int i = 0; i < warehouse.length; ++i) {
            limitSoFar = Math.min(limitSoFar, warehouse[i]);
            warehouse[i] = limitSoFar;
        }

        Arrays.sort(boxes);
        int numBoxes = 0;
        for (int i = warehouse.length - 1; i >= 0; --i) {
            if (numBoxes >= boxes.length) {
                break;
            }
            if (boxes[numBoxes] > warehouse[i]) {
                continue;
            }
            ++numBoxes;
        }

        return numBoxes;
    }
}
