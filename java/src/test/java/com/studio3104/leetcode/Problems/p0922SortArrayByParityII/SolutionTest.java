package com.studio3104.leetcode.Problems.p0922SortArrayByParityII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5, 7}, new int[]{4, 5, 2, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sortArrayByParityII(int[] A, int[] expected) {
        int[] result = solution.sortArrayByParityII(A);
        Assertions.assertArrayEquals(expected, result);
    }
}
