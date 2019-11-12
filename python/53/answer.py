from typing import List
import copy


def max_sub_array(nums: List[int], maximum: int = 0) -> int:
    current: int = sum(nums)
    if maximum == 0 and current < 0 or maximum < current:
        maximum = current

    if len(nums) == 1:
        return maximum

    nums2 = copy.copy(nums)
    nums.pop(0)
    nums2.pop()

    return max([
        max_sub_array(nums, maximum),
        max_sub_array(nums2, maximum),
    ])


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        return max_sub_array(nums)
