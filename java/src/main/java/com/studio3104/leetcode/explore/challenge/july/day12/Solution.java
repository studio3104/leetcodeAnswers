package com.studio3104.leetcode.explore.challenge.july.day12;

import java.math.BigInteger;

public class Solution {
    public int reverseBits(int n) {
        int reversed = 0;

        for (int i = 31; i >= 0; i--) {
            int lastDigit = n & 1;
            if (lastDigit == 1) reversed = reversed | (lastDigit << i);
            n = n >> 1;
        }

        return reversed;
    }

    public int reverseBits1(int n) {
        String nBinary = String.format("%032d", new BigInteger(Integer.toBinaryString(n)));
        String reversed = new StringBuilder(nBinary).reverse().toString();
        return (int) Long.parseLong(reversed, 2);
    }
}
