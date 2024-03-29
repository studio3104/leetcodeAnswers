package com.studio3104.leetcode.explore.challenge.y2021.February.day27;

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("/ by zero");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (divisor == 1 || divisor == -1) {
            return divisor > 0 ? dividend : -dividend;
        }

        boolean negative = false;
        if (dividend < 0) {
            negative = true;
            dividend = -dividend;
        }
        if (divisor < 0) {
            negative = !negative;
            divisor = -divisor;
        }

        int quotient = 0;
        int temporaryQuotient = 1;
        int originalDivisor = divisor;

        while (dividend >= divisor) {
            divisor <<= 1;

            if (dividend >= divisor) {
                temporaryQuotient <<= 1;
                continue;
            }

            divisor >>= 1;
            dividend -= divisor;
            quotient += temporaryQuotient;
            temporaryQuotient = 1;
            divisor = originalDivisor;
        }

        return negative ? -quotient : quotient;
    }
}
