package com.studio3104.leetcode.explore.challenge.August.day17;

public class Solution {
    public int[] distributeCandies(int candies, int numPeople) {
        int[] answer = new int[numPeople];
        int numToGive = 1, currentIndex = 0;

        while (candies >= numToGive) {
            if (currentIndex == numPeople) currentIndex = 0;
            candies -= numToGive;
            answer[currentIndex++] += numToGive++;
        }

        answer[currentIndex == numPeople ? 0 : currentIndex] += candies;
        return answer;
    }
}
