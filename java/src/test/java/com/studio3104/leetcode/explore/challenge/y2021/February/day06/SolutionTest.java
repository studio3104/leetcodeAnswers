package com.studio3104.leetcode.explore.challenge.y2021.February.day06;

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
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[1,2,3,null,5,null,4]", List.of(1, 3, 4)),
                Arguments.of("[1,2,3,4]", List.of(1, 3, 4)),
                Arguments.of("[1,null,2,null,5,4,6,3]", List.of(1, 2, 5, 6, 3)),
                Arguments.of("[5,3,6,1,4,null,null,null,2]", List.of(5, 6, 4, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rightSideView(
            @ConvertWith(TreeNodeConverter.class) TreeNode root,
            List<Integer> expected
    ) {
        Solution solution = new Solution();
        List<Integer> actual = solution.rightSideView(root);
        Assertions.assertEquals(expected, actual);
    }
}
