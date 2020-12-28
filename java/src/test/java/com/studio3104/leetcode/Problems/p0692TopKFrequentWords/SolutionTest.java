package com.studio3104.leetcode.Problems.p0692TopKFrequentWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"i", "love", "leetcode", "i", "love", "coding"},
                        2,
                        List.of("i", "love")
                ),
                Arguments.of(
                        new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},
                        4,
                        List.of("the", "is", "sunny", "day")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void topKFrequent(String[] words, int k, List<String> expected) {
        List<String> actual = solution.topKFrequent(words, k);
        Assertions.assertEquals(expected, actual);
    }
}
