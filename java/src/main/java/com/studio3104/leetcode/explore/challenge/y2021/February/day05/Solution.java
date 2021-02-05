package com.studio3104.leetcode.explore.challenge.y2021.February.day05;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<>();

        // Change the connection destination of the previous element if `..` or `.` is included
        for (String s : path.split("/")) {
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
