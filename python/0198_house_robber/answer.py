from typing import Dict, List


class Solution:
    def __init__(self) -> None:
        self.memo: Dict[int, int] = {}

    def _rob(self, nums: List[int], index: int) -> int:
        if len(nums) <= index:
            return 0

        if index in self.memo:
            return self.memo[index]

        larger = max(
            self._rob(nums, index + 2) + nums[index],
            self._rob(nums, index + 3) + nums[index],
        )

        self.memo[index] = larger
        return larger

    def rob(self, nums: List[int]) -> int:
        return max(self._rob(nums, 0), self._rob(nums, 1))
