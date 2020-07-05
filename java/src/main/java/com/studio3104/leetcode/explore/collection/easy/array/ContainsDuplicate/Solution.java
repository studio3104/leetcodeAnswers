package com.studio3104.leetcode.explore.collection.easy.array.ContainsDuplicate;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return (nums.length != numsSet.size());
    }
}
