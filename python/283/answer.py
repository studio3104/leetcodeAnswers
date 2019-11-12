from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not set(nums) == {0}:
            zero_count = nums.count(0)
            for _ in range(zero_count):
                nums.remove(0)
                nums.append(0)
