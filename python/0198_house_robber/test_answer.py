from typing import List

import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3, 1], 4),
    ([2, 7, 9, 3, 1], 12),
))
def test_is_valid(input_value: List[int], expected_result: int, solution: Solution) -> None:
    assert solution.rob(input_value) == expected_result
