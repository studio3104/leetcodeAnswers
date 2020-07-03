package com.studio3104.leetcode.explore.challenge.july.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0};
        List<List<Integer>> cycles = new ArrayList<>();

        for (int day = 1; day <= N; day++) {
            for (int i = 0; i < 8; i++) {
                int left = i == 0 ? -1 : cells[i - 1];
                int right = i == 7 ? -1 : cells[i + 1];
                answer[i] = left == right ? 1 : 0;
            }
            cells = answer.clone();

            List<Integer> c = Arrays.stream(cells).boxed().collect(Collectors.toList());
            if (!cycles.contains(c)) {
                cycles.add(c);
                continue;
            }

            int index = (N % cycles.size()) - 1;
            index = index == -1 ? cycles.size() - 1 : index;
            return cycles.get(index).stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}
