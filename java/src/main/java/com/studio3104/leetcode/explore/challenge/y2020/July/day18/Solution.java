package com.studio3104.leetcode.explore.challenge.y2020.July.day18;

import java.util.*;

public class Solution {
    List<Integer> order;
    Set<Integer> visited;
    Map<Integer, Set<Integer>> graph;

    Solution() {
        this.order = new ArrayList<>();
        this.visited = new HashSet<>();
        this.graph = new HashMap<>();
    }

    void DFS(int key, Set<Integer> nextNodes) {
        if (visited.contains(key)) return;
        visited.add(key);
        for (int nextNode: nextNodes) DFS(nextNode, graph.get(nextNode));
        order.add(key);
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int[] courses: prerequisites) {
            int c = courses[0], p = courses[1];
            graph.putIfAbsent(c, new HashSet<>());
            graph.putIfAbsent(p, new HashSet<>());
            graph.get(p).add(c);
        }

        for (Map.Entry<Integer, Set<Integer>> node: graph.entrySet()) {
            DFS(node.getKey(), node.getValue());
        }

        Collections.reverse(order);
        return order.stream().mapToInt(i -> i).toArray();
    }
}
