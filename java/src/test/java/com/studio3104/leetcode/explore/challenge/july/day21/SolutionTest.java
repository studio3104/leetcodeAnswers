package com.studio3104.leetcode.explore.challenge.july.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    char[][] board = new char[][]{
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'},
    };

    @ParameterizedTest
    @CsvSource({
            "ABCCED, true",
            "SEE, true",
            "ABCB, false",
    })
    void exist(String word, boolean expected) {
        boolean result = solution.exist(board, word);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new char[][]{{'a'}}, "a", true),
                Arguments.of(
                        new char[][]{
                                {'A', 'B', 'C', 'E'},
                                {'S', 'F', 'E', 'S'},
                                {'A', 'D', 'E', 'E'},
                        }, "ABCEFSADEESE",
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void exist(char[][] board, String word, boolean expected) {
        boolean result = solution.exist(board, word);
        Assertions.assertEquals(expected, result);
    }
}
