package com.studio3104.leetcode.explore.challenge.y2021.January.week2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private void markVisited(Node node, Set<Integer> visited) {
        if (node == null || visited.contains(node.val)) {
            return;
        }

        for (Node child : node.children) {
            markVisited(child, visited);
            visited.add(child.val);
        }
    }

    public Node findRoot(List<Node> tree) {
        Set<Integer> visited = new HashSet<>();
        for (Node node : tree) {
            markVisited(node, visited);
        }

        for (Node node : tree) {
            if (!visited.contains(node.val)) {
                return node;
            }
        }

        return null;
    }
}
