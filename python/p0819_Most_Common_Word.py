from typing import Dict, List, Tuple
import pytest


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        pass


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        ('Bob hit a ball, the hit BALL flew far after it was hit.', ['hit']),
        'ball',
    ),
))
def test_is_valid(input_value: Tuple[str, List[str]], expected_result: str, solution: Solution) -> None:
    assert sorted(solution.mostCommonWord(*input_value)) == expected_result
