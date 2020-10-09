package com.studio3104.leetcode.explore.challenge.October.day09;

import com.studio3104.leetcode.structure.TreeNode;
import com.studio3104.leetcode.structure.TreeNodeConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CodecTest {
    Codec codec = new Codec();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("[2,1,3]"),
                Arguments.of("[]")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testCodec(
            @ConvertWith(TreeNodeConverter.class) TreeNode root
    ) {
        String serialized = codec.serialize(root);
        Assertions.assertEquals(root, codec.deserialize(serialized));
    }
}
