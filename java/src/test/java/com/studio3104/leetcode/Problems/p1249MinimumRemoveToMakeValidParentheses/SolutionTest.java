package com.studio3104.leetcode.Problems.p1249MinimumRemoveToMakeValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("lee(t(c)o)de)", "lee(t(c)o)de"),
                Arguments.of("a)b(c)d", "ab(c)d"),
                Arguments.of("))((", ""),
                Arguments.of("(a(b(c)d)", "a(b(c)d)")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minRemoveToMakeValid(String s, String expected) {
        String result = solution.minRemoveToMakeValid(s);
        Assertions.assertEquals(expected, result);
    }
}
