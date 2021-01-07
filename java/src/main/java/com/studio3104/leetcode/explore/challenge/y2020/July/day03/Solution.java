package com.studio3104.leetcode.explore.challenge.y2020.July.day03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0};
        Map<List<Integer>, Integer> cycles = new HashMap<>();

        for (int day = 1; day <= N; day++) {
            for (int i = 0; i < 8; i++) {
                int left = i == 0 ? -1 : cells[i - 1];
                int right = i == 7 ? -1 : cells[i + 1];
                answer[i] = left == right ? 1 : 0;
            }
            cells = answer.clone();

            List<Integer> c = Arrays.stream(cells).boxed().collect(Collectors.toList());
            if (!cycles.containsKey(c)) {
                cycles.put(c, day);
                continue;
            }

            int index = N % cycles.size();
            index = index == 0 ? cycles.size() : index;

            for (Map.Entry<List<Integer>, Integer> cycle: cycles.entrySet()) {
                if (cycle.getValue() == index)
                    return cycle.getKey().stream().mapToInt(Integer::intValue).toArray();
            }

            throw new RuntimeException();
        }

        return answer;
    }
}
