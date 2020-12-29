package com.studio3104.leetcode.Problems.p0014LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        StringBuilder common = new StringBuilder(strings[0]);

        for (int i = 1; i < strings.length; ++i) {
            if (common.length() == 0) {
                return "";
            }

            String s = strings[i];
            StringBuilder n = new StringBuilder();

            for (int j = 0; j < Math.min(s.length(), common.length()); ++j) {
                if (common.charAt(j) != s.charAt(j)) {
                    break;
                }
                n.append(s.charAt(j));
            }

            common = n;
        }

        return common.toString();
    }
}
