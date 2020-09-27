package com.studio3104.leetcode.contest.weekly208.CrawlerLogFolder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"d1/", "d2/", "../", "d21/", "./"}, 2),
                Arguments.of(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}, 3),
                Arguments.of(new String[]{"d1/", "../", "../", "../"}, 0),
                Arguments.of(new String[]{"./", "../", "./"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minOperations(String[] logs, int expected) {
        int result = solution.minOperations(logs);
        Assertions.assertEquals(expected, result);
    }
}
