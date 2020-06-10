from typing import List, Tuple

import bisect

import pytest


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        return nums.index(target) if target in nums else bisect.bisect_left(nums, target)


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('searchInsert', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (([1, 3, 5, 6], 5), 2),
        (([1, 3, 5, 6], 2), 1),
        (([1, 3, 5, 6], 7), 4),
        (([1, 3, 5, 6], 0), 0),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[List[int], int], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
