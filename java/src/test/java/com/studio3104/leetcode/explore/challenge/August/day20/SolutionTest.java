package com.studio3104.leetcode.explore.challenge.August.day20;

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
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 5, 2, 4, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void reorderList(
            @ConvertWith(ListNodeConverter.class) ListNode head,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        solution.reorderList(head);
        Assertions.assertEquals(expected, head);
    }
}
