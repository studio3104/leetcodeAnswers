from typing import Dict, List

import copy

import pytest


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        nums.sort()

    def sortColors1(self, nums: List[int]) -> None:
        p0, p2 = 0, len(nums) - 1
        current = 0

        while current <= p2:
            if nums[current] == 0:
                nums[current], nums[p0] = nums[p0], nums[current]
                p0 += 1
                current += 1
            elif nums[current] == 1:
                current += 1
            elif nums[current] == 2:
                nums[current], nums[p2] = nums[p2], nums[current]
                p2 -= 1

    def sortColors2(self, nums: List[int]) -> None:
        counter: Dict[int, int] = {i: 0 for i in range(min(nums), max(nums) + 1)}
        for n in nums:
            counter[n] += 1

        current = min(nums)
        for i in range(len(nums)):
            while counter[current] == 0:
                current += 1
            nums[i] = current
            counter[current] -= 1


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('sortColors', 'sortColors1', 'sortColors2', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, 0, 2, 1, 1, 0], [0, 0, 1, 1, 2, 2]),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: List[int]) -> None:

        iv = copy.copy(input_value)
        getattr(solution, method_name)(iv)
        iv == expected_value
