package com.studio3104.leetcode.Problems.p1570DotProductOfTwoSparseVectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SparseVector {
    private final Map<Integer, Integer> nonZeroes;

    SparseVector(int[] nums) {
        nonZeroes = IntStream
                .range(0, nums.length)
                .filter(i -> nums[i] != 0)
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> nums[i]));
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        return nonZeroes.keySet().stream()
                .filter(vec.nonZeroes::containsKey)
                .reduce(0, (n, i) -> n + nonZeroes.get(i) * vec.nonZeroes.get(i));

    }
}
