package com.studio3104.leetcode.explore.challenge.September.day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    String S;
    Map<Character, Integer> last;

    int getBorder(char c, int index) {
        int border = last.get(c);
        for (int i = index; i <= border; ++i) border = Math.max(border, last.get(S.charAt(i)));
        return ++border;
    }

    public List<Integer> partitionLabels(String S) {
        this.S = S;
        last = new HashMap<>();

        for (int i = 0; i < S.length(); ++i) {
            char c = S.charAt(i);
            last.put(c, i);
        }

        int index = 0, lastIndex;
        List<Integer> labels = new ArrayList<>();

        while (index < S.length()) {
            lastIndex = index;
            index = getBorder(S.charAt(index), index);
            labels.add(index - lastIndex);
        }

        return labels;
    }
}
