package com.studio3104.leetcode.explore.challenge.july.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "catsanddog", List.of("cat", "cats", "and", "sand", "dog"),
                        List.of("cats and dog", "cat sand dog")
                ),
                Arguments.of(
                        "pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple"),
                        List.of("pine apple pen apple", "pineapple pen apple", "pine applepen apple")
                ),
                Arguments.of(
                        "catsandog", List.of("cats", "dog", "sand", "and", "cat"),
                        List.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void wordBreak(String s, List<String> wordDict, List<String> expected) {
        List<String> result = solution.wordBreak(s, wordDict);
        //Collections.sort(expected);
        //Collections.sort(result);
        Assertions.assertEquals(expected, result);
    }
}
