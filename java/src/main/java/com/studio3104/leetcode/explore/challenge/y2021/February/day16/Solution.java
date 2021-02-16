package com.studio3104.leetcode.explore.challenge.y2021.February.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> sbs = new ArrayList<>();
        sbs.add(new StringBuilder());

        for (char c : S.toCharArray()) {
            if (Character.isDigit(c)) {
                for (StringBuilder sb : sbs) {
                    sb.append(c);
                }
                continue;
            }

            int n = sbs.size();
            for (int i = 0; i < n; ++i) {
                sbs.add(new StringBuilder(sbs.get(i)));
                sbs.get(i).append(Character.toLowerCase(c));
                sbs.get(n + i).append(Character.toUpperCase(c));
            }
        }

        return sbs.stream().map(StringBuilder::toString).collect(Collectors.toList());
    }
}
