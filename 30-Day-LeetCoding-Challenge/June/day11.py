from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        counter = {0: 0, 1: 0, 2: 0}
        for n in nums:
            counter[n] += 1

        current = 0
        for i in range(len(nums)):
            while counter[current] == 0:
                current += 1
            nums[i] = current
            counter[current] -= 1
