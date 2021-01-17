package com.studio3104.leetcode.explore.challenge.y2021.January.day17;

class Solution {
    public int countVowelStrings(int n) {
        return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
    }
}
