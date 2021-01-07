package com.studio3104.leetcode.explore.challenge.y2020.September.day29;

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
                Arguments.of("leetcode", List.of("leet", "code"), true),
                Arguments.of("applepenapple", List.of("apple", "pen"), true),
                Arguments.of("catsandog", List.of("cats", "dog", "sand", "and", "cat"), false),
                Arguments.of("aaaaaaa", List.of("aaaa", "aa"), false),
                Arguments.of("aaaaaaa", List.of("aaaa", "aaa"), true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void wordBreak(String s, List<String> wordDict, boolean expected) {
        boolean result = solution.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }
}
