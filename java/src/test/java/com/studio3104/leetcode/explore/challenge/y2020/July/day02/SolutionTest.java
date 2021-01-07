package com.studio3104.leetcode.explore.challenge.y2020.July.day02;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "[3,9,20,null,null,15,7]",
                        Arrays.asList(Arrays.asList(15, 7), Arrays.asList(9, 20), Collections.singletonList(3))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void levelOrderBottom(
            @ConvertWith(TreeNodeConverter.class) TreeNode tree,
            List<List<Integer>> expected
    ) {
        List<List<Integer>> result = solution.levelOrderBottom(tree);
        assertEquals(result, expected);
    }
}