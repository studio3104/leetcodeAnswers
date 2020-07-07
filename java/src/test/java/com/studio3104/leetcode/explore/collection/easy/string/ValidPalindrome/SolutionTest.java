package com.studio3104.leetcode.explore.collection.easy.string.ValidPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isPalindrome(String s, boolean expected) {
        boolean result = solution.isPalindrome(s);
        Assertions.assertEquals(expected, result);
    }
}