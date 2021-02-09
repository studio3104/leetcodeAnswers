package com.studio3104.leetcode.explore.challenge.y2021.February.day09;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]",
                        "[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]"
                ),
                Arguments.of(
                        "[0,null,1]",
                        "[1,null,1]"
                ),
                Arguments.of(
                        "[1,0,2]",
                        "[3,3,2]"
                ),
                Arguments.of(
                        "[3,2,4,1]",
                        "[7,9,4,10]"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void convertBST(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            @ConvertWith(TreeNodeConverter.class) TreeNode expected
    ) {
        Solution solution = new Solution();
        TreeNode actual = solution.convertBST(root);
        Assertions.assertEquals(expected, actual);
    }
}
