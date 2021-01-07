package com.studio3104.leetcode.explore.challenge.y2020.July.day15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> str = Arrays.asList(s.split("\\s+"));
        Collections.reverse(str);
        return String.join(" ", str);
    }
}
