package com.studio3104.leetcode.explore.challenge.y2020.December.day09;

import com.studio3104.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BSTIteratorTest {
    @Test
    public void testBTSIterator() {
        TreeNode root = TreeNode.createFromString("[7,3,15,null,null,9,20]");
        BSTIterator b = new BSTIterator(root);
        Assertions.assertEquals(3, b.next());
        Assertions.assertEquals(7, b.next());
        Assertions.assertTrue(b.hasNext());
        Assertions.assertEquals(9, b.next());
        Assertions.assertTrue(b.hasNext());
        Assertions.assertEquals(15, b.next());
        Assertions.assertTrue(b.hasNext());
        Assertions.assertEquals(20, b.next());
        Assertions.assertFalse(b.hasNext());
    }
}
