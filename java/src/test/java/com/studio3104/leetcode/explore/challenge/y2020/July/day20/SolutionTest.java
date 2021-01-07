package com.studio3104.leetcode.explore.challenge.y2020.July.day20;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 6, 3, 4, 5, 6}, 6,
                        new int[]{1, 2, 3, 4, 5}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeElements(
            @ConvertWith(ListNodeConverter.class) ListNode head, int val,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode result = solution.removeElements(head, val);
        Assertions.assertEquals(expected, result);
    }
}
