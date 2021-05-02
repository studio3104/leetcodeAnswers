package com.studio3104.leetcode.explore.challenge.y2021.May.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int scheduleCourse(int[][] courses) {
        // Sort ascending by deadline
        Arrays.sort(courses, Comparator.comparingInt(c -> c[1]));

        // Initialize a priority queue that holds durations in descending order
        PriorityQueue<Integer> durationsOfCoursesTaken = new PriorityQueue<>((c1, c2) -> c2 - c1);

        int totalTimeSpent = 0;

        for (int[] c : courses) {
            int duration = c[0];
            int deadline = c[1];

            if (totalTimeSpent + duration <= deadline) {
                durationsOfCoursesTaken.add(duration);
                totalTimeSpent += duration;
                continue;
            }

            if (durationsOfCoursesTaken.isEmpty() || durationsOfCoursesTaken.peek() <= duration) {
                continue;
            }

            totalTimeSpent -= durationsOfCoursesTaken.poll();
            totalTimeSpent += duration;
            durationsOfCoursesTaken.add(duration);
        }

        return durationsOfCoursesTaken.size();
    }
}
