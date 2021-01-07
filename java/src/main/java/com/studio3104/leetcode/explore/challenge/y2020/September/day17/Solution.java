package com.studio3104.leetcode.explore.challenge.y2020.September.day17;

public class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] position = new int[]{0, 0};
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;

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

        return (position[0] == 0 && position[1] == 0) || direction != 0;
    }
}
