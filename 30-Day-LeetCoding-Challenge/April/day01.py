from typing import Dict, List

import pytest

from functools import reduce


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        memo: Dict[int, int] = {}

        for n in nums:
            if n not in memo:
                memo[n] = 0
            memo[n] += 1

        for num, count in memo.items():
            if count == 1:
                return num

        return 0  # It won't be evaluated, Just to avoid MyPy error.

    def singleNumber2(self, nums: List[int]) -> int:
        return reduce(lambda a, b: a ^ b, nums, 0)


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('singleNumber', 'singleNumber2'))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, 2, 1], 1),
    ))
    def test_single_number(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
