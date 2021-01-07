package com.studio3104.leetcode.explore.challenge.y2020.July.day27;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
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
                        new int[]{9, 3, 15, 20, 7},
                        new int[]{9, 15, 7, 20, 3},
                        "[3,9,20,null,null,15,7]"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void buildTree(
            int[] inorder, int[] postorder,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode result = solution.buildTree(inorder, postorder);
        Assertions.assertEquals(expected, result);
    }
}
