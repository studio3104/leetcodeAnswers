package com.studio3104.leetcode.explore.challenge.y2021.May.week2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Solution {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        int limitSoFar = warehouse[0];
        int[] capacities = new int[warehouse.length];
        for (int i = 0; i < warehouse.length; ++i) {
            limitSoFar = Math.min(limitSoFar, warehouse[i]);
            capacities[i] = limitSoFar;
        }

        PriorityQueue<Integer> boxQueue = Arrays.stream(boxes).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        int numBoxes = 0;
        for (int i = capacities.length - 1; i >= 0 && !boxQueue.isEmpty(); --i) {
            if (boxQueue.peek() > capacities[i]) {
                continue;
            }
            boxQueue.poll();
            ++numBoxes;
        }

        return numBoxes;
    }
}
