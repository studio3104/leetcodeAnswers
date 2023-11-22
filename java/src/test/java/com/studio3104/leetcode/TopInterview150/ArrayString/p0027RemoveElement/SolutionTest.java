package com.studio3104.leetcode.TopInterview150.ArrayString.p0027RemoveElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeElement(int[] nums, int val, int expected, int[] expectedNums) {
        int result = solution.removeElement(nums, val);
        Assertions.assertEquals(expected, result);

        for (int i = 0; i < expectedNums.length; ++i) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}
