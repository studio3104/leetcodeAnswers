package com.studio3104.leetcode.explore.challenge.y2020.July.day24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Integer, List<Integer>> parents;
    List<List<Integer>> paths;

    void traverse(int parent, LinkedList<Integer> path) {
        path.addFirst(parent);
        if (parent == 0) {
            paths.add(path);
            return;
        }
        for (int p: parents.get(parent)) {
            LinkedList<Integer> pc = new LinkedList<>(path);
            traverse(p, pc);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        parents = new HashMap<>();
        paths = new ArrayList<>();

        for (int i = 0; i < graph.length; ++i) {
            for(int num: graph[i]) {
                parents.putIfAbsent(num, new ArrayList<>());
                parents.get(num).add(i);
            }
        }

        for (Integer parent: parents.get(graph.length - 1)) {
            traverse(parent, new LinkedList<>(List.of(graph.length - 1)));
        }

        return paths;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}});
    }
}
