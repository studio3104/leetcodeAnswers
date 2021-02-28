package com.studio3104.leetcode.explore.challenge.y2021.February.day28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreqStackTest {

    @Test
    void testFreqStack() {
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);

        Assertions.assertEquals(5, freqStack.pop());
        Assertions.assertEquals(7, freqStack.pop());
        Assertions.assertEquals(5, freqStack.pop());
        Assertions.assertEquals(4, freqStack.pop());
    }
}
