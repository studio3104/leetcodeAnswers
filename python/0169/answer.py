from typing import Dict, List

import math


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority = math.ceil(len(nums) / 2)
        cache: Dict[int, int] = {}

        for n in nums:
            if n not in cache:
                cache[n] = 0

            cache[n] += 1

            if cache[n] >= majority:
                return n

        return 0
