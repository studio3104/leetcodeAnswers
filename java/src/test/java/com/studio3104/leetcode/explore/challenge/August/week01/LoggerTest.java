package com.studio3104.leetcode.explore.challenge.August.week01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerTest {
    Logger logger = new Logger();

    @Test
    void shouldPrintMessage() {
        Assertions.assertTrue(logger.shouldPrintMessage(1, "foo"));
        Assertions.assertTrue(logger.shouldPrintMessage(2, "bar"));
        Assertions.assertFalse(logger.shouldPrintMessage(3, "foo"));
        Assertions.assertFalse(logger.shouldPrintMessage(8, "bar"));
        Assertions.assertFalse(logger.shouldPrintMessage(10, "foo"));
        Assertions.assertTrue(logger.shouldPrintMessage(11, "foo"));
    }
}
