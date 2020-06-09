from typing import Tuple

import pytest


class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('isSubsequence', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (('abc', 'ahbgdc'), True),
        (('axc', 'ahbgdc'), False),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: Tuple[str, str], expected_value: bool) -> None:

        assert getattr(solution, method_name)(*input_value) is expected_value
