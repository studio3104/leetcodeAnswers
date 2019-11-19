from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        h = {n: i for i, n in enumerate(nums)}

        for i, n in enumerate(nums):
            sub = target - n
            if sub in h and i != h[sub]:
                return [i, h[sub]]

        return []
