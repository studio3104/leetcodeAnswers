from typing import Dict, Tuple

import pytest


class Solution:
    def __init__(self) -> None:
        self.memo: Dict[Tuple[int, int], int] = {}

    def uniquePaths(self, m: int, n: int) -> int:
        if (m, n) in self.memo:
            return self.memo[(m, n)]

        if m == 1 or n == 1:
            return 1

        to_left = self.uniquePaths(m - 1, n)
        to_up = self.uniquePaths(m, n - 1)

        self.memo[(m - 1, n)] = to_left
        self.memo[(m, n - 1)] = to_up

        return to_up + to_left


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('uniquePaths', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ((3, 2), 3),
        ((7, 3), 28),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[int, int], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
