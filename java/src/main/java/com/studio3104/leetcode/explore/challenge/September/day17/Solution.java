package com.studio3104.leetcode.explore.challenge.September.day17;

public class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] position = new int[]{0, 0};
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;

        for (int i = 0; i < 4; ++i) {
            for (char instruction: instructions.toCharArray()) {
                if (instruction == 'G') {
                    position[0] += directions[direction][0];
                    position[1] += directions[direction][1];
                    continue;
                }

                if (instruction == 'R') {
                    ++direction;
                    if (direction > 3) direction = 0;
                }

                if (instruction == 'L') {
                    --direction;
                    if (direction < 0) direction = 3;
                }
            }

            if (position[0] == 0 && position[1] == 0) return true;
        }

        return false;
    }
}
