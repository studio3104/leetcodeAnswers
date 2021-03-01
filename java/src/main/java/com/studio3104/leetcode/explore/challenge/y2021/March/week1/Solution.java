package com.studio3104.leetcode.explore.challenge.y2021.March.week1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> indexOf = new HashMap<>();
        for (int i = 0; i < keyboard.length(); ++i) {
            indexOf.put(keyboard.charAt(i), i);
        }

        int currentPosition = 0;
        int cost = 0;

        for (char c : word.toCharArray()) {
            int i = indexOf.get(c);
            cost += Math.abs(i - currentPosition);
            currentPosition = i;
        }

        return cost;
    }
}
