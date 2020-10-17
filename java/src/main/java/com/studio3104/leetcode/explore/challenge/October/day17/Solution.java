package com.studio3104.leetcode.explore.challenge.October.day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/*
An approach I could come up by myself was described "Easy stupid” on the solution page...
Here's just a transcription from the one of the efficient ways.
 */
public class Solution {
    Map<Character, Integer> map = new HashMap<>() {{
        put('A', 0);
        put('C', 1);
        put('G', 2);
        put('T', 3);
    }};

    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10, length = s.length();
        if (length <= L) return new ArrayList<>();

        int a = 4, aL = (int) Math.pow(a, L);

        int[] nums = IntStream
                .range(0, length)
                .map(i -> map.get(s.charAt(i)))
                .toArray();

        int h = IntStream
                .range(0, L)
                .reduce(0, (i, j) -> i * a + nums[j]);

        Set<Integer> seen = new HashSet<>();
        seen.add(h);

        Set<String> output = new HashSet<>();

        for (int start = 1; start < length - L + 1; ++start) {
            h = h * a - nums[start - 1] * aL + nums[start + L - 1];
            if (seen.contains(h)) output.add(s.substring(start, start + L));
            seen.add(h);
        }

        return new ArrayList<>(output);
    }
}
