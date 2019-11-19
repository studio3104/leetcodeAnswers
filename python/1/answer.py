from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        h = {i: n for i, n in enumerate(nums)}

        for i, n in h.items():
            sub = target - n

            if sub not in nums:
                continue

            for i2, n2 in h.items():
                if sub == n2:
                    return [i, i2]

        return []
