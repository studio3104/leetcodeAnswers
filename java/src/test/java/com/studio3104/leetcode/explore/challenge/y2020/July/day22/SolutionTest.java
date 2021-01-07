package com.studio3104.leetcode.explore.challenge.y2020.July.day22;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "[3,9,20,null,null,15,7]",
                        List.of(List.of(3), List.of(20, 9), List.of(15, 7))
                ),
                Arguments.of(
                        "[1,2,3,4,null,null,5]",
                        List.of(List.of(1), List.of(3, 2), List.of(4, 5))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void zigzagLevelOrder(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            List<List<Integer>> expected
    ) {
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        Assertions.assertEquals(expected, result);
    }
}
