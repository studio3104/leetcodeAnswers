from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        while nums:
            if len(nums) == 1:
                return nums[0]
            f, s = nums.pop(), nums.pop()
            if f != s:
                return f
