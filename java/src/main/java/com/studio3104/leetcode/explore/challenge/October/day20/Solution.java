package com.studio3104.leetcode.explore.challenge.October.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    Map<Integer, Node> m = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (m.containsKey(node.val)) return m.get(node.val);

        Node clone = new Node(node.val);
        m.put(node.val, clone);

        clone.neighbors = node.neighbors
                .stream()
                .map(this::cloneGraph)
                .collect(Collectors.toList());

        return clone;
    }
}
