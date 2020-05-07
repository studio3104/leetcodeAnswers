from typing import List, Tuple

import pytest


class Solution:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('stringShift', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (('abc', [[0, 1], [1, 2]]), 'cab'),
        (('abcdefg', [[1, 1], [1, 1], [0, 2], [1, 3]]), 'efgabcd'),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[str, List[List[int]]], expected_value: str) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
