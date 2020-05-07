from typing import List, Tuple

import pytest


class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        _S: List[str] = []
        for s in S:
            if s != '#':
                _S.append(s)
            elif _S:
                _S.pop(-1)

        _T: List[str] = []
        for t in T:
            if t != '#':
                _T.append(t)
            elif _T:
                _T.pop(-1)

        return _S == _T


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
