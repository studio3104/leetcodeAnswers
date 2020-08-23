package com.studio3104.leetcode.explore.challenge.August.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class StreamCheckerTest {
    static class Pair {
        char letter;
        boolean expected;

        public Pair(char letter, boolean expected) {
            this.letter = letter;
            this.expected = expected;
        }
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"cd", "f", "kl"},
                        List.of(
                                new Pair('a', false),
                                new Pair('b', false),
                                new Pair('c', false),
                                new Pair('d', true),
                                new Pair('e', false),
                                new Pair('f', true),
                                new Pair('g', false),
                                new Pair('h', false),
                                new Pair('j', false),
                                new Pair('k', false),
                                new Pair('l', true)
                        )
                ),
                Arguments.of(
                        new String[]{"ab", "ba", "aaab", "abab", "baa"},
                        List.of(
                                new Pair('a', false),
                                new Pair('a', false),
                                new Pair('a', false),
                                new Pair('a', false),
                                new Pair('a', false),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('b', false),
                                new Pair('b', false),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('b', false),
                                new Pair('b', false),
                                new Pair('b', false),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('a', true),
                                new Pair('a', false),
                                new Pair('b', true),
                                new Pair('a', true),
                                new Pair('a', true),
                                new Pair('a', false)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void query(String[] words, List<Pair> pairs) {
        StreamChecker streamChecker = new StreamChecker(words);
        for (Pair p: pairs) {
            Assertions.assertEquals(p.expected, streamChecker.query(p.letter));
        }
    }
}
