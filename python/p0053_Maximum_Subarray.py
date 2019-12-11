from typing import List, Tuple
from functools import lru_cache
import copy


@lru_cache(maxsize=None)
def max_sub_array(nums: Tuple[int], maximum: int = 0) -> int:
    current: int = sum(nums)
    if maximum == 0 and current < 0 or maximum < current:
        maximum = current

    if len(nums) == 1:
        return maximum

    _nums = list(nums)
    _nums2 = copy.copy(_nums)
    _nums.pop(0)
    _nums2.pop()

    return max([
        max_sub_array(tuple(_nums), maximum),
        max_sub_array(tuple(_nums2), maximum),
    ])


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        return max_sub_array(tuple(nums))
