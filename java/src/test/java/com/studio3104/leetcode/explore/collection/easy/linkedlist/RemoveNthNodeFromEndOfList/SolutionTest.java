package com.studio3104.leetcode.explore.collection.easy.linkedlist.RemoveNthNodeFromEndOfList;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.crypto.AEADBadTagException;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5}, 2,
                        new int[]{1, 2, 3, 5}
                ),
                Arguments.of(
                        new int[]{1}, 1,
                        new int[]{}
                ),
                Arguments.of(
                        new int[]{1, 2}, 1,
                        new int[]{1}
                ),
                Arguments.of(
                        new int[]{1, 2}, 2,
                        new int[]{2}
                ),
                Arguments.of(
                        new int[]{1, 2, 3}, 1,
                        new int[]{1, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeNthFromEnd(
            @ConvertWith(ListNodeConverter.class) ListNode head, int n,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        ListNode result = solution.removeNthFromEnd(head, n);
        Assertions.assertEquals(expected, result);
    }
}