from typing import Dict, List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        counter: Dict[int, int] = {i: 0 for i in range(min(nums), max(nums) + 1)}
        for n in nums:
            counter[n] += 1

        current = min(nums)
        for i in range(len(nums)):
            while counter[current] == 0:
                current += 1
            nums[i] = current
            counter[current] -= 1
