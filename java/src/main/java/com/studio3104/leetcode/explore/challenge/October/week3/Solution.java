package com.studio3104.leetcode.explore.challenge.October.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int rooms = 0;

        for (int[] i: intervals) {
            heap.add(i[1]);
            while (heap.peek() != null && heap.peek() <= i[0]) heap.poll();
            rooms = Math.max(rooms, heap.size());
        }

        return rooms;
    }
}
