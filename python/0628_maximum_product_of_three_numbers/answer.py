from typing import List

from functools import reduce


def calc(nums: List[int]) -> int:
    return reduce(
        (lambda a, b: a * b),
        nums,
    )


class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()
        return max(
            calc([nums[0], nums[1], nums[-1]]),
            calc([nums[-1], nums[-2], nums[-3]]),
        )
