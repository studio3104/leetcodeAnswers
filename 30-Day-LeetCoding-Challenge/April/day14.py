from typing import List, Tuple

from collections import deque

import pytest


class Solution:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        if not s:
            return ''

        amount = 0

        for _s in shift:
            sign = 1
            if _s[0] == 0:  # Left
                sign = -1

            amount += _s[1] * sign

        right_direction = True
        if amount < 0:
            right_direction = False  # Left
            amount *= -1
        amount = amount % len(s)

        string = deque(s)

        for _ in range(amount):
            if right_direction:
                string.appendleft(string.pop())
            else:
                string.append(string.popleft())

        return ''.join(string)


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
