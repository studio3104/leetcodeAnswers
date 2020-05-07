from .structures import ListNode

from typing import Tuple

import pytest


class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('backspaceCompare', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (('ab#c', 'ad#c'), True),
        (('ab##', 'c#d#'), True),
        (('a##c', '#a#c'), True),
        (('a#c', 'b'), False),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[str], expected_value: bool) -> None:

        assert getattr(solution, method_name)(*input_value) == expected_value
