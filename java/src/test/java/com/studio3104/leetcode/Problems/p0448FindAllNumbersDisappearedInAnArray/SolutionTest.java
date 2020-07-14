package com.studio3104.leetcode.Problems.p0448FindAllNumbersDisappearedInAnArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findDisappearedNumbers(int[] nums, List<Integer> expected) {
        List<Integer> result = solution.findDisappearedNumbers(nums);
        Assertions.assertEquals(expected, result);
    }
}
