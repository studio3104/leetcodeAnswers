package com.studio3104.leetcode.explore.challenge.October.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;

        if (A.equals(B)) {
            Map<Character, Integer> counter = new HashMap<>();
            for (int i = 0; i < A.length(); ++i) {
                char c = A.charAt(i);
                counter.put(c, counter.getOrDefault(c, 0) + 1);
                if (counter.get(c) > 1) return true;
            }
            return false;
        }

        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < A.length(); ++i) {
            if (A.charAt(i) != B.charAt(i)) diff.add(i);
        }

        return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && A.charAt(diff.get(1)) == B.charAt(diff.get(0));
    }
}
