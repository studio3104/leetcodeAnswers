package com.studio3104.leetcode.explore.collection.easy.array.SingleNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void singleNumber(int[] nums, int expected) {
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
}
