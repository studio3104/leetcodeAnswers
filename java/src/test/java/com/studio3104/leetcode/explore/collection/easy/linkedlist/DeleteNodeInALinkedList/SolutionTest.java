package com.studio3104.leetcode.explore.collection.easy.linkedlist.DeleteNodeInALinkedList;

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
                        new int[]{4}, new int[]{5, 1, 9},
                        new int[]{4, 1, 9}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void deleteNode(
            @ConvertWith(ListNodeConverter.class) ListNode nodeA,
            @ConvertWith(ListNodeConverter.class) ListNode nodeB,
            @ConvertWith(ListNodeConverter.class) ListNode expected
    ) {
        nodeA.next = nodeB;
        solution.deleteNode(nodeB);
        Assertions.assertEquals(expected, nodeA);
    }
}
