from typing import Dict

import pytest


class Solution:
    def __init__(self) -> None:
        self.m: Dict[int, None] = {}

    def square_sum(self, n: int) -> int:
        answer = 0
        for num in list(str(n)):
            answer += int(num) ** 2

        return answer

    def isHappy(self, n: int) -> bool:
        if n == 1:
            return True

        if n in self.m:
            return False

        self.m[n] = None
        return self.isHappy(self.square_sum(n))


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('isHappy', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (19, True),
        (18, False),
        (7, True),
        (10, True),
    ))
    def test_single_number(
            self, solution: Solution, method_name: str,
            input_value: int, expected_value: bool) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
