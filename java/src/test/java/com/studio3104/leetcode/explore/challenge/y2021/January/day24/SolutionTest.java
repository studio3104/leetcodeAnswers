package com.studio3104.leetcode.explore.challenge.y2021.January.day24;

import com.studio3104.leetcode.structure.ListNode;
import com.studio3104.leetcode.structure.ListNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}},
                        new int[]{1, 1, 2, 3, 4, 4, 5, 6}
                ),
                Arguments.of(new int[][]{}, new int[]{}),
                Arguments.of(new int[][]{{}}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void mergeKLists(int[][] arr, @ConvertWith(ListNodeConverter.class) ListNode expected) {
        Solution solution = new Solution();

        ListNode[] lists = Arrays.stream(arr)
                .map(ListNode::createFromArray)
                .toArray(ListNode[]::new);

        Assertions.assertEquals(expected, solution.mergeKLists(lists));
    }
}
