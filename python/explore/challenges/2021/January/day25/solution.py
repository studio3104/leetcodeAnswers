from typing import List


class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        if k == 0:
            return True

        distance = k

        for n in nums:
            if n == 0:
                distance += 1
                continue

            if distance < k:
                return False

            distance = 0

        return True
