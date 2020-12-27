package com.studio3104.leetcode.explore.challenge.December.day27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}, 3),
                Arguments.of(new int[]{7}, 0),
                Arguments.of(new int[]{7, 6, 9, 6, 9, 6, 9, 7}, 1),
                Arguments.of(new int[]{6, 1, 9}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minJumps(int[] arr, int expected) {
        int actual = solution.minJumps(arr);
        Assertions.assertEquals(expected, actual);
    }
}
