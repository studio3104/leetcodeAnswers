package com.studio3104.leetcode.explore.challenge.November.day24;

import java.util.LinkedList;

class Solution {
    public int calculate(String s) {
        LinkedList<Integer> numbers = new LinkedList<>();

        char operator = '+';
        int num = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') continue;

            if (c != '+' && c != '-' && c != '*' && c != '/') {
                num = num * 10 + Character.getNumericValue(c);
                continue;
            }

            if (operator == '+') {
                numbers.add(num);
            }

            if (operator == '-') {
                numbers.add(num * -1);
            }

            if (operator == '*' && !numbers.isEmpty()) {
                numbers.add(numbers.pollLast() * num);
            }

            if (operator == '/' && !numbers.isEmpty()) {
                numbers.add(numbers.pollLast() / num);
            }

            num = 0;
            operator = c;
        }

        int n = numbers.isEmpty() ? 0 : numbers.pollLast();
        switch (operator) {
            case '+':
                n += num;
                break;
            case '-':
                n -= num;
                break;
            case '*':
                n *= num;
                break;
            case '/':
                n /= num;
                break;
        }
        numbers.add(n);


        return numbers.stream().mapToInt(i -> i).sum();
    }
}
