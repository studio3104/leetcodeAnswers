package com.studio3104.leetcode.explore.challenge.August.day31;

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
                Arguments.of("[5,3,6,2,4,null,7]", 3, "[5,4,6,2,null,null,7]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void deleteNode(
            @ConvertWith(TreeNodeConverter.class) TreeNode root, int key,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        TreeNode result = solution.deleteNode(root, key);
        Assertions.assertEquals(expected, result);
    }
}
