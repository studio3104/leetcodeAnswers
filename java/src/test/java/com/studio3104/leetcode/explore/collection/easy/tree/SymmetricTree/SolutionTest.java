package com.studio3104.leetcode.explore.collection.easy.tree.SymmetricTree;

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
                Arguments.of("[1,2,2,3,4,4,3]", true),
                Arguments.of("[1,2,2,null,3,null,3]", false),
                Arguments.of("[]", true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isSymmetric(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            boolean expected
    ) {
        boolean result = solution.isSymmetric(root);
        Assertions.assertEquals(expected, result);
    }
}