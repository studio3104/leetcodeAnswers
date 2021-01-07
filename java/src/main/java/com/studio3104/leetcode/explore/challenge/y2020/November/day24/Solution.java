package com.studio3104.leetcode.explore.challenge.y2020.November.day24;

import java.util.LinkedList;

class Solution {
    private void calculate(char operator, LinkedList<Integer> numbers, int num) {
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
    }

    public int calculate(String s) {
        LinkedList<Integer> numbers = new LinkedList<>();

        char operator = '+';
        int currentNumber = 0;

        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) continue;

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
                continue;
            }

            calculate(operator, numbers, currentNumber);
            currentNumber = 0;
            operator = c;
        }

        calculate(operator, numbers, currentNumber);
        return numbers.stream().mapToInt(i -> i).sum();
    }
}
