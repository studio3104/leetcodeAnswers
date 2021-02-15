package com.studio3104.leetcode.explore.challenge.y2021.February.week3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        // Construct a processes tree, into a HashMap
        Map<Integer, Set<Integer>> childrenOf = new HashMap<>();
        for (int i = 0; i < pid.size(); ++i) {
            int child = pid.get(i);
            int parent = ppid.get(i);

            childrenOf.putIfAbsent(parent, new HashSet<>());
            childrenOf.get(parent).add(child);
        }

        // Traverse the tree from `kill`, and construct the processes list to be killed
        List<Integer> killed = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        q.add(kill);

        while (!q.isEmpty()) {
            int k = q.pollFirst();
            killed.add(k);
            if (childrenOf.containsKey(k)) {
                q.addAll(childrenOf.get(k));
            }
        }

        return killed;
    }
}
