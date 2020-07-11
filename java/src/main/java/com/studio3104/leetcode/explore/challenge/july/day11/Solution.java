package com.studio3104.leetcode.explore.challenge.july.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of());

        for (int num: nums) {
            List<List<Integer>> current = new ArrayList<>();
            for (List<Integer> r: result) {
                List<Integer> c = Stream.concat(r.stream(), List.of(num).stream()).collect(Collectors.toList());
                current.add(c);
            }
            result.addAll(current);
        }

        return result;
    }
}
