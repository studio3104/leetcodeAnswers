package com.studio3104.leetcode.explore.challenge.y2021.May.week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private void traverseAndRemove(int node, Map<Integer, Set<Integer>> graph) {
        if (!graph.containsKey(node)) {
            return;
        }

        Set<Integer> nodes = graph.get(node);
        graph.remove(node);

        for (int n : nodes) {
            traverseAndRemove(n, graph);
        }
    }

    public int countComponents(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            graph.put(i, new HashSet<>());
        }

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int counter = 0;
        for (int i = 0; i < n; ++i) {
            if (!graph.containsKey(i)) {
                continue;
            }

            traverseAndRemove(i, graph);
            ++counter;
        }

        return counter;
    }
}
