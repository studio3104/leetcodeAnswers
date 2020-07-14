package com.studio3104.leetcode.Problems.p0448FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> answer = IntStream
                .rangeClosed(1, nums.length)
                .boxed()
                .collect(Collectors.toSet());

        for (int n: nums) answer.remove(n);

        return new ArrayList<>(answer);
    }
}
