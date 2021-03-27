package com.studio3104.leetcode.explore.challenge.y2021.March.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"e", "o"},
                        new String[]{"facebook", "google", "leetcode"}
                ),
                Arguments.of(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"l", "e"},
                        new String[]{"apple", "google", "leetcode"}
                ),
                Arguments.of(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"e", "oo"},
                        new String[]{"facebook", "google"}
                ),
                Arguments.of(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"lo", "eo"},
                        new String[]{"google", "leetcode"}
                ),
                Arguments.of(
                        new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                        new String[]{"ec", "oc", "ceo"},
                        new String[]{"facebook", "leetcode"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void wordSubsets(String[] A, String[] B, String[] expected) {
        Solution solution = new Solution();
        List<String> actual = solution.wordSubsets(A, B);
        Assertions.assertEquals(
                new HashSet<>(Arrays.asList(expected)),
                new HashSet<>(actual)
        );
    }
}