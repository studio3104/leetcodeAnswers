package com.studio3104.leetcode.explore.challenge.y2021.February.day05;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        // Construct strings between the slashes and make them contained into a queue
        Deque<String> q = new ArrayDeque<>(
                Arrays.asList(path.split("/").clone())
        );

        // Change the connection destination of the previous element if `..` or `.` is included
        int iterateCount = q.size();
        for (int i = 0; i < iterateCount && !q.isEmpty(); ++i) {
            String s = q.pollFirst();
            if (s.isEmpty() || s.equals(".")) {
                continue;
            }
            if (s.equals("..")) {
                q.pollLast();
                continue;
            }
            q.addLast(s);
        }

        if (q.isEmpty()) {
            return "/";
        }

        // Construct the result string to return
        StringBuilder result = new StringBuilder();
        for (String d : q) {
            result.append("/").append(d);
        }

        return result.toString();
    }
}
