from typing import List

import pytest

import math


class Solution(object):
    def numSquares(self, n):
        square_nums = [i ** 2 for i in range(0, int(math.sqrt(n)) + 1)]
        dp = [0] + [float('inf') for _ in range(n)]

        for square in square_nums:
            for i in range(square, n + 1):
                dp[i] = min(dp[i], dp[i - square] + 1)

        print(dp)
        return dp[-1]


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('numSquares', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (12, 3),
        (13, 2),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: int, expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
