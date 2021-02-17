package com.studio3104.leetcode.explore.collection.medium2.ArrayAndStrings.GroupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
//                Arguments.of(
//                        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
//                        List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"))
//                ),
                Arguments.of(new String[]{""}, List.of(List.of(""))),
                Arguments.of(new String[]{"a"}, List.of(List.of("a")))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void groupAnagrams(String[] strs, List<List<String>> expected) {
        Solution solution = new Solution();
        List<List<String>> actual = solution.groupAnagrams(strs);
        Assertions.assertEquals(expected, actual);
    }
}
