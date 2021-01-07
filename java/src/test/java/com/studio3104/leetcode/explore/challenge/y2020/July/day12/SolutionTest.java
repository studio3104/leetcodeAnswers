package com.studio3104.leetcode.explore.challenge.y2020.July.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("00000010100101000001111010011100", "00111001011110000010100101000000"),
                Arguments.of("11111111111111111111111111111101", "10111111111111111111111111111111")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void reverseBits(String nBinary, String expectedBinary) {
        int result = solution.reverseBits((int) Long.parseLong(nBinary, 2));
        Assertions.assertEquals((int) Long.parseLong(expectedBinary, 2), result);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void reverseBits1(String nBinary, String expectedBinary) {
        int result = solution.reverseBits1((int) Long.parseLong(nBinary, 2));
        Assertions.assertEquals((int) Long.parseLong(expectedBinary, 2), result);
    }
}
