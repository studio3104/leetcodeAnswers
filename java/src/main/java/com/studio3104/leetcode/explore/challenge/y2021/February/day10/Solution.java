package com.studio3104.leetcode.explore.challenge.y2021.February.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        Map<Node, Integer> indexOf = new HashMap<>();
        List<Node> cache = new ArrayList<>();

        for (int i = 0; current != null; ++i) {
            indexOf.put(current, i);
            cache.add(new Node(current.val));
            if (i > 0) {
                cache.get(i - 1).next = cache.get(i);
            }
            current = current.next;
        }

        current = head;
        for (int i = 0; current != null; ++i) {
            if (current.random != null) {
                cache.get(i).random = cache.get(indexOf.get(current.random));
            }
            current = current.next;
        }

        return cache.isEmpty() ? null : cache.get(0);
    }
}
