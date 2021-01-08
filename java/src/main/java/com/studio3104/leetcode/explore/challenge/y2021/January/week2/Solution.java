package com.studio3104.leetcode.explore.challenge.y2021.January.week2;

import java.util.List;

class Solution {
    public Node findRoot(List<Node> tree) {
        int result = 0;

        for (Node node : tree) {
            result ^= node.val;
            for (Node child : node.children) {
                result ^= child.val;
            }
        }

        for (Node node : tree) {
            if (result == node.val) {
                return node;
            }
        }

        return null;
    }
}
