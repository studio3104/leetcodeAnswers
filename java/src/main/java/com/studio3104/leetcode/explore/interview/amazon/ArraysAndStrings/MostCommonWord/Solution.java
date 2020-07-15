package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.MostCommonWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Solution {
    private final Pattern WDS = Pattern.compile("[^\\w\\d\\s,]");
    private final Pattern S = Pattern.compile("[\\s,]+");

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] paragraphArray = S.split(WDS.matcher(paragraph).replaceAll("").toLowerCase());

        Map<String, Integer> counter = new HashMap<>();
        for (String p: paragraphArray) {
            if (bannedSet.contains(p)) continue;
            counter.put(p, counter.getOrDefault(p, 0) + 1);
        }

        String mostCommon = "";
        int max = 0;
        for (Map.Entry<String, Integer> m: counter.entrySet()) {
            if (max < m.getValue()) {
                mostCommon = m.getKey();
                max = m.getValue();
            }
        }

        return mostCommon;
    }
}
