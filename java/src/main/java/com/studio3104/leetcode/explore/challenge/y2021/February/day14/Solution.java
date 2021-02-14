package com.studio3104.leetcode.explore.challenge.y2021.February.day14;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] g = new int[graph.length];
        Arrays.fill(g, -1);

        for (int i = 0; i < graph.length; ++i) {
            if (g[i] != -1) {
                continue;
            }

            Deque<Integer> q = new ArrayDeque<>();
            q.push(i);
            g[i] = 0;

            while (!q.isEmpty()) {
                int node = q.pop();
                for (int neighbor : graph[node]) {
                    if (g[neighbor] == g[node]) {
                        return false;
                    }
                    if (g[neighbor] != -1) {
                        continue;
                    }
                    q.push(neighbor);
                    g[neighbor] = g[node] ^ 1;
                }
            }
        }

        return true;
    }
}
