package com.studio3104.leetcode.Problems.p0006ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[][] grid = new char[numRows][(int) Math.ceil(s.length() / 2.0)];
        int[] p = new int[]{0, 0};
        int[][] d = new int[][]{{1, 0}, {-1, 1}};
        int di = 0;

        for (char c: s.toCharArray()) {
            grid[p[0]][p[1]] = c;

            int nextP0 = p[0] + d[di][0];
            if (nextP0 < 0 || nextP0 >= numRows) di = di == 0 ? 1 : 0;
            p = new int[]{p[0] + d[di][0], p[1] + d[di][1]};
        }

        StringBuilder result = new StringBuilder();

        for (char[] chars : grid) {
            for (int i = 0; i < grid[0].length; ++i) {
                char c = chars[i];
                if (c == 0) continue;
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
