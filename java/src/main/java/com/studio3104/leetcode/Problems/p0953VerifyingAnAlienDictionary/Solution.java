package com.studio3104.leetcode.Problems.p0953VerifyingAnAlienDictionary;

import java.util.Arrays;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderOf = new int[26];
        for (int i = 0; i < order.length(); ++i) {
            orderOf[order.charAt(i) - 'a'] = i;
        }

        String[] originalWords = words.clone();
        Arrays.sort(words, (o1, o2) -> {
            if (o1.equals(o2)) return 0;

            for (int i = 0; i < Math.min(o1.length(), o2.length()); ++i) {
                char c1 = o1.charAt(i), c2 = o2.charAt(i);
                if (c1 != c2) {
                    return orderOf[c1 - 'a'] - orderOf[c2 - 'a'];
                }
            }

            return o1.length() < o2.length() ? -1 : 1;
        });

        return Arrays.equals(words, originalWords);
    }
}
