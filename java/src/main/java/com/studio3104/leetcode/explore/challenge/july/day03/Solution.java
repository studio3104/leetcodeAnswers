package com.studio3104.leetcode.explore.challenge.july.day03;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0};

        for (int day = 1; day <= N; day++) {
            for (int i = 0; i < 8; i++) {
                int left = i == 0 ? -1 : cells[i - 1];
                int right = i == 7 ? -1 : cells[i + 1] ;
                answer[i] = left == right ? 1 : 0;
            }
            cells = answer.clone();
        }

        return answer;
    }
}