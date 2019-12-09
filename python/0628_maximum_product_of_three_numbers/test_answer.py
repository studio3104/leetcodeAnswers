from typing import List

import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3], 6),
    ([1, 2, 3, 4], 24),
    ([-1, -2, -3], -6),
    ([-4, -3, -2, -1, 60], 720),
))
def test_is_valid(input_value: List[int], expected_result: int, solution: Solution) -> None:
    assert solution.maximumProduct(input_value) == expected_result
