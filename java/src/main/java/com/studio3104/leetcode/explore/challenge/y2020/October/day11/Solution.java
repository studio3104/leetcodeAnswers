package com.studio3104.leetcode.explore.challenge.y2020.October.day11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) lastIndex.put(s.charAt(i), i);

        Set<Character> enqueued = new HashSet<>();
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (enqueued.contains(c)) continue;

            while (!deque.isEmpty()) {
                char last = deque.peekLast();
                if (last < c || lastIndex.get(last) < i) break;
                enqueued.remove(deque.pollLast());
            }

            enqueued.add(c);
            deque.addLast(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) sb.append(deque.poll());

        return sb.toString();
    }
}
