package com.studio3104.leetcode.explore.challenge.y2021.February.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("abpcplea", List.of("ale", "apple", "monkey", "plea"), "apple"),
                Arguments.of("abpcplea", List.of("a", "b", "c"), "a"),
                Arguments.of("aaa", List.of("aaa", "aa", "a"), "aaa")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findLongestWord(String s, List<String> d, String expected) {
        Solution solution = new Solution();
        String actual = solution.findLongestWord(s, new ArrayList<>(d));
        Assertions.assertEquals(expected, actual);
    }
}
