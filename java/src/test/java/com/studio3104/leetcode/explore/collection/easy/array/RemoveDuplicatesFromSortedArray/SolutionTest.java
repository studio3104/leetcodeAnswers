package com.studio3104.leetcode.explore.collection.easy.array.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, 0, 0, 0, 0, 3, 3}, new int[]{-1, 0, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeDuplicates(int[] nums, int[] expectedNums) {
        int k = solution.removeDuplicates(nums);
        Assertions.assertEquals(k, expectedNums.length);
        for (int i = 0; i < k; ++i) {
            Assertions.assertEquals(nums[i], expectedNums[i]);
        }
    }
}
