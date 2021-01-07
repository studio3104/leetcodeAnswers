package com.studio3104.leetcode.explore.challenge.y2020.October.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    private Node cloneGraph(Node node, Map<Integer, Node> m) {
        if (node == null) return null;

        if (m.containsKey(node.val)) return m.get(node.val);

        Node clone = new Node(node.val);
        m.put(node.val, clone);

        clone.neighbors = node.neighbors
                .stream()
                .map(n -> cloneGraph(n, m))
                .collect(Collectors.toList());

        return clone;
    }

    public Node cloneGraph(Node node) {
        return cloneGraph(node, new HashMap<>());
    }
}
