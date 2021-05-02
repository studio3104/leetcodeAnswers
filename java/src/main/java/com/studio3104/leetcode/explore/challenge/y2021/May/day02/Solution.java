package com.studio3104.leetcode.explore.challenge.y2021.May.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(c -> c[1]));
        PriorityQueue<Integer> durationOfCoursesTaken = new PriorityQueue<>((c1, c2) -> c2 - c1);
        int totalTimeSpent = 0;

        for (int[] c : courses) {
            int duration = c[0];
            int deadline = c[1];

            if (totalTimeSpent + duration <= deadline) {
                durationOfCoursesTaken.add(duration);
                totalTimeSpent += duration;
                continue;
            }

            if (durationOfCoursesTaken.isEmpty() || durationOfCoursesTaken.peek() <= duration) {
                continue;
            }

            totalTimeSpent -= durationOfCoursesTaken.poll();
            totalTimeSpent += duration;
            durationOfCoursesTaken.add(duration);
        }

        return durationOfCoursesTaken.size();
    }
}
