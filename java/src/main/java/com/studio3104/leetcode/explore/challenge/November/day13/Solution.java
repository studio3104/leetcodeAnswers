package com.studio3104.leetcode.explore.challenge.November.day13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private void traverse(Node node, int level, Map<Integer, Node> levels) {
        if (node == null) return;

        if (levels.containsKey(level)) {
            levels.get(level).next = node;
        }

        levels.put(level, node);

        traverse(node.left, level + 1, levels);
        traverse(node.right, level + 1, levels);
    }

    public Node connect(Node root) {
        traverse(root, 0, new HashMap<>());
        return root;
    }
}
