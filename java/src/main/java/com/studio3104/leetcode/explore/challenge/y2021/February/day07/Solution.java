package com.studio3104.leetcode.explore.challenge.y2021.February.day07;

import java.util.Arrays;

class Solution {
    public int[] shortestToChar(String s, char c) {
        // Initialize the int[] to return, and fill all elements Integer.MAX_VALUE
        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);

        // Iterate each character from the head of the string while memoize the last appeared position of the target character
        // Set the distance between the current one and the position
        int p = -1;
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if (current == c) {
                p = i;
            }
            if (p == -1) {
                continue;
            }
            result[i] = i - p;
        }

        // Take the same approach again, from the tail in this time
        // If the distance is shorter than the set value, replace it
        p = -1;
        for (int i = s.length() - 1; i >= 0; --i) {
            char current = s.charAt(i);
            if (current == c) {
                p = i;
            }
            if (p == -1) {
                continue;
            }
            result[i] = Math.min(result[i], p - i);
        }

        return result;
    }
}
