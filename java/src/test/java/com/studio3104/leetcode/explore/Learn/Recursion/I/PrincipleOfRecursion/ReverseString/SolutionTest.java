package com.studio3104.leetcode.explore.Learn.Recursion.I.PrincipleOfRecursion.ReverseString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}, new char[]{'h', 'a', 'n', 'n', 'a', 'H'})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void reverseString(char[] s, char[] expected) {
        solution.reverseString(s);
        Assertions.assertArrayEquals(expected, s);
    }
}
