package com.studio3104.leetcode.explore.challenge.y2020.November.day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    private void constructGraph(int[] edge, Map<Integer, Set<Integer>> graph) {
        int a = edge[0];
        int b = edge[1];
        graph.putIfAbsent(a, new HashSet<>());
        graph.putIfAbsent(b, new HashSet<>());
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    private int getDepth(int parent, Map<Integer, Set<Integer>> graph, int depth, Set<Integer> visited) {
        visited.add(parent);
        int currentDepth = depth;

        for (int child : graph.get(parent)) {
            if (!visited.contains(child)) {
                depth = Math.max(depth, getDepth(child, graph, currentDepth + 1, visited));
            }
        }

        return depth;
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);
        if (n == 2) return List.of(0, 1);

        Map<Integer, Set<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            constructGraph(edge, graph);
        }

        Map<Integer, List<Integer>> depths = new HashMap<>();
        int minimumDepth = Integer.MAX_VALUE;

        for (int parent : graph.keySet()) {
            int depth = getDepth(parent, graph, 1, new HashSet<>());
            depths.putIfAbsent(depth, new ArrayList<>());
            depths.get(depth).add(parent);
            minimumDepth = Math.min(minimumDepth, depth);
        }

        return depths.get(minimumDepth);
    }
}
