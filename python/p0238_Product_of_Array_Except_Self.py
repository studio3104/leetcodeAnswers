from typing import List
import pytest


# Note: Please solve it without division and in O(n).
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left: List[int] = [0 for _ in range(len(nums))]
        right: List[int] = [0 for _ in range(len(nums))]

        for i in range(len(nums)):
            if i == 0:
                left[i] = 1
                continue
            left[i] = left[i-1] * nums[i-1]

        for i in reversed(range(len(nums))):
            if i == len(nums) - 1:
                right[i] = 1
                continue
            right[i] = right[i+1] * nums[i+1]

        return [left[i] * right[i] for i in range(len(nums))]


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3, 4], [24, 12, 8, 6]),
))
def test_is_valid(input_value: List[int], expected_result: List[int], solution: Solution) -> None:
    assert solution.productExceptSelf(input_value) == expected_result
