package com.studio3104.leetcode.explore.challenge.December.day06;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private void connect(Node node, int level, Map<Integer, Node> tails) {
        if (node == null) {
            return;
        }

        node.next = null;

        if (tails.containsKey(level)) {
            tails.get(level).next = node;
        }

        tails.put(level, node);

        connect(node.left, level + 1, tails);
        connect(node.right, level + 1, tails);
    }

    public Node connect(Node root) {
        connect(root, 0, new HashMap<>());
        return root;
    }
}
