package com.studio3104.leetcode.explore.challenge.july.day28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Solution {
    final char interval = 'i';
    Map<Character, Integer> taskCounts;

    void countTasks(char[] tasks) {
        taskCounts = new HashMap<>();
        for (char t: tasks) taskCounts.put(t, taskCounts.getOrDefault(t, 0) + 1);
    }

    LinkedList<Character> sortTasksByFrequency(LinkedList<Character> tasks) {
        if (tasks.size() <= 1) return tasks;

        int pi = tasks.size() / 2;
        char p = tasks.get(pi);
        int pv = taskCounts.get(p);

        LinkedList<Character> less = new LinkedList<>();
        LinkedList<Character> more = new LinkedList<>();

        for (int i = 0; i < tasks.size(); ++i) {
            if (i == pi) continue;
            char c = tasks.get(i);
            if (taskCounts.get(c) > pv) more.add(c);
            else less.add(c);
        }

        LinkedList<Character> sorted = new LinkedList<>(sortTasksByFrequency(less));
        sorted.add(p); sorted.addAll(sortTasksByFrequency(more));
        return sorted;
    }

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        countTasks(tasks);
        Set<Character> tasksList = new HashSet<>();
        for (char c: tasks) tasksList.add(c);
        LinkedList<Character> frequencyOrderTasks = sortTasksByFrequency(new LinkedList<>(tasksList));

        LinkedList<Character> process = new LinkedList<>();
        int leastIntervalIndex = 0;

        while (!frequencyOrderTasks.isEmpty()) {
            int insertTo = leastIntervalIndex;
            Character current = frequencyOrderTasks.pollLast();

            for (int i = taskCounts.get(current); i > 0; --i) {
                while (process.size() - 1 <= insertTo + 1) process.add(interval);
                while (process.get(insertTo) != interval) ++insertTo;
                process.set(insertTo, current);
                insertTo += n + 1;
            }

            ++leastIntervalIndex;
        }

        while (process.get(process.size() - 1) == interval) process.pollLast();
        return process.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.leastInterval(
                new char[]{
                        'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', 'F', 'F',
                        'G', 'G', 'H', 'H', 'I', 'I', 'J', 'J', 'K', 'K', 'L', 'L',
                        'M', 'M', 'N', 'N', 'O', 'O', 'P', 'P', 'Q', 'Q', 'R', 'R',
                        'S', 'S', 'T', 'T', 'U', 'U', 'V', 'V', 'W', 'W', 'X', 'X',
                        'Y', 'Y', 'Z', 'Z'
                }, 2
        );
    }
}
