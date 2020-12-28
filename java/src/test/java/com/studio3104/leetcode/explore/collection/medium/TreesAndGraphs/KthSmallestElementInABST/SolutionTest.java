package com.studio3104.leetcode.explore.collection.medium.TreesAndGraphs.KthSmallestElementInABST;

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
                Arguments.of("[3,1,4,null,2]", 1, 1),
                Arguments.of("[5,3,6,2,4,null,null,1]", 3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void kthSmallest(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            int k,
            int expected
    ) {
        int actual = solution.kthSmallest(root, k);
        Assertions.assertEquals(expected, actual);
    }
}
