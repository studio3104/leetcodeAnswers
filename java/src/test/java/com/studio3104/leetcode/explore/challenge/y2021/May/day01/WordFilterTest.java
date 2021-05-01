package com.studio3104.leetcode.explore.challenge.y2021.May.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class WordFilterTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"apple"}, "a", "e", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void f(String[] words, String prefix, String suffix, int expected) {
        WordFilter wordFilter = new WordFilter(words);
        int actual = wordFilter.f(prefix, suffix);
        Assertions.assertEquals(expected, actual);
    }
}
