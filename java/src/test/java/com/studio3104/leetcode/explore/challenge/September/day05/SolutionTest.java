package com.studio3104.leetcode.explore.challenge.September.day05;

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
                Arguments.of("[2,1,4]", "[1,0,3]", List.of(0, 1, 1, 2, 3, 4)),
                Arguments.of("[0,-10,10]", "[5,1,7,0,2]", List.of(-10, 0, 0, 1, 2, 5, 7, 10)),
                Arguments.of("[]", "[5,1,7,0,2]", List.of(0, 1, 2, 5, 7)),
                Arguments.of("[0,-10,10]", "[]", List.of(-10, 0, 10))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getAllElements(
            @ConvertWith(TreeNodeConverter.class) TreeNode root1,
            @ConvertWith(TreeNodeConverter.class) TreeNode root2,
            List<Integer> expected
    ) {
        List<Integer> result = solution.getAllElements(root1, root2);
        Assertions.assertEquals(expected, result);
    }
}
