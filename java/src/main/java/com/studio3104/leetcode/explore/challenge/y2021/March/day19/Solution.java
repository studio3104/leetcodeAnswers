package com.studio3104.leetcode.explore.challenge.y2021.March.day19;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> opened = new HashSet<>();
        opened.add(0);
        Queue<Integer> q = new ArrayDeque<>(rooms.get(0));

        while (!q.isEmpty()) {
            int key = q.poll();
            if (opened.contains(key)) {
                continue;
            }
            opened.add(key);
            q.addAll(rooms.get(key));
        }

        return rooms.size() == opened.size();
    }
}
