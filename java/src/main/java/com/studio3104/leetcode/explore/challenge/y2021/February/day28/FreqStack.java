package com.studio3104.leetcode.explore.challenge.y2021.February.day28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

class FreqStack {
    private final LinkedList<Integer> stack;
    private final Map<Integer, Integer> counter;
    private final Set<Integer> mostFrequentElements;

    public FreqStack() {
        stack = new LinkedList<>();
        counter = new HashMap<>();
        mostFrequentElements = new HashSet<>();
    }

    public void push(int x) {
        stack.push(x);
        counter.put(x, counter.getOrDefault(x, 0) + 1);
        mostFrequentElements.clear();
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }

        if (mostFrequentElements.isEmpty()) {
            updateMostFrequentElements();
        }

        int i = 0;
        for (; i < stack.size(); ++i) {
            if (mostFrequentElements.contains(stack.get(i))) {
                break;
            }
        }

        int n = stack.remove(i);
        mostFrequentElements.remove(n);

        if (counter.get(n) == 1) {
            counter.remove(n);
        } else {
            counter.put(n, counter.get(n) - 1);
        }

        return n;
    }

    private void updateMostFrequentElements() {
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> e : counter.entrySet()) {
            int n = e.getKey();
            int c = e.getValue();

            if (c <= 0 || c < maxCount) {
                continue;
            }

            if (c > maxCount) {
                maxCount = c;
                mostFrequentElements.clear();
            }
            mostFrequentElements.add(n);
        }
    }
}
