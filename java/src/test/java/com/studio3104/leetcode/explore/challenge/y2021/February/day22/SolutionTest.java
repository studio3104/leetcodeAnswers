package com.studio3104.leetcode.explore.challenge.y2021.February.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    @lombok.Value(staticConstructor = "of")
    static class TestParameter {
        String s;
        List<String> d;
        String expected;
    }

    static Stream<TestParameter> argumentsProvider() {
        return Stream.of(
                TestParameter.of("abpcplea", List.of("ale", "apple", "monkey", "plea"), "apple"),
                TestParameter.of("abpcplea", List.of("a", "b", "c"), "a"),
                TestParameter.of("aaa", List.of("aaa", "aa", "a"), "aaa")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findLongestWord(TestParameter p) {
        Solution solution = new Solution();
        String actual = solution.findLongestWord(p.s, p.d);
        Assertions.assertEquals(p.expected, actual);
    }
}
