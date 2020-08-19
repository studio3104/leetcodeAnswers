package com.studio3104.leetcode.explore.challenge.August.day19;

import java.util.Set;

public class Solution {
    static final Set<Character> VOWELS = Set.of('a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O');

    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] sArray = S.split(" ");
        for (int i = 0; i < sArray.length; ++i) {
            String s = sArray[i];
            StringBuilder buff = new StringBuilder();

            int start = VOWELS.contains(s.charAt(0)) ? 0 : 1;
            for (int j = start; j < s.length(); ++j) buff.append(s.charAt(j));
            if (start == 1) buff.append(s.charAt(0));

            buff.append("ma");
            buff.append("a".repeat(i + 1));
            buff.append(' ');

            sb.append(buff);
        }

        return sb.toString().trim();
    }
}
