package com.studio3104.leetcode.structure;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class TreeNodeConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object o, Class<?> aClass) throws ArgumentConversionException {
        return TreeNode.createFromString(o.toString());
    }
}
