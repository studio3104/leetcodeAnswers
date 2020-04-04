from typing import List

import pytest


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('maxSubArray', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
    ))
    def test_single_number(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
