package com.studio3104.leetcode.explore.challenge.y2021.February.day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class FreqStack {
    Map<Integer, Integer> frequencyOf;
    Map<Integer, Stack<Integer>> stackPerFrequencyOf;
    int maxFrequency;

    public FreqStack() {
        frequencyOf = new HashMap<>();
        stackPerFrequencyOf = new HashMap<>();
        maxFrequency = 0;
    }

    public void push(int x) {
        int f = frequencyOf.getOrDefault(x, 0) + 1;
        frequencyOf.put(x, f);

        if (f > maxFrequency) {
            maxFrequency = f;
        }

        stackPerFrequencyOf.computeIfAbsent(f, z -> new Stack<>()).push(x);
    }

    public int pop() {
        int x = stackPerFrequencyOf.get(maxFrequency).pop();
        frequencyOf.put(x, frequencyOf.get(x) - 1);

        if (stackPerFrequencyOf.get(maxFrequency).isEmpty()) {
            --maxFrequency;
        }

        return x;
    }
}
