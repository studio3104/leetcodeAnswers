package com.studio3104.leetcode.Problems.p0235LowestCommonAncestorOfABinarySearchTree;

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
                        "[6,2,8,0,4,7,9,null,null,3,5]",
                        "[2,0,4,null,null,3,5]",
                        "[8,7,9]",
                        "[6,2,8,0,4,7,9,null,null,3,5]"
                ),
                Arguments.of(
                        "[6,2,8,0,4,7,9,null,null,3,5]",
                        "[2,0,4,null,null,3,5]",
                        "[4,3,5]",
                        "[2,0,4,null,null,3,5]"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void lowestCommonAncestor(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode p,
            @ConvertWith(TreeNodeConverter.class) TreeNode q,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        Assertions.assertEquals(expected, result);
    }
}
