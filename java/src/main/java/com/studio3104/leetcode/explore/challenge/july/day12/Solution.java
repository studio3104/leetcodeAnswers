package com.studio3104.leetcode.explore.challenge.july.day12;

import java.math.BigInteger;

public class Solution {
    public int reverseBits(int n) {
        String nBinary = String.format("%032d", new BigInteger(Integer.toBinaryString(n)));
        String reversed = new StringBuilder(nBinary).reverse().toString();
        return (int) Long.parseLong(reversed, 2);
    }
}
