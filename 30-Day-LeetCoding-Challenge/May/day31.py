from typing import List, Tuple

from collections import deque

import pytest


class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('minDistance', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[str], expected_value: int) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
