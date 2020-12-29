package com.studio3104.leetcode.Problems.p0953VerifyingAnAlienDictionary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true),
                Arguments.of(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz", false),
                Arguments.of(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isAlienSorted(String[] words, String order, boolean expected) {
        boolean actual = solution.isAlienSorted(words, order);
        Assertions.assertEquals(expected, actual);
    }
}
