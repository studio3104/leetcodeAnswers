package com.studio3104.leetcode.explore.collection.easy.array.PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + 1;

            if (sum == 10)
                digits[i] = 0;
            else {
                digits[i] = sum;
                break;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(new int[]{1}, 0, result, 0, 1);
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
