package com.studio3104.leetcode.Problems.p0771JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        for (int i = 0; i < J.length(); ++i) jewels.add(J.charAt(i));

        int numJewels = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (jewels.contains(S.charAt(i))) ++numJewels;
        }

        return numJewels;
    }
}
