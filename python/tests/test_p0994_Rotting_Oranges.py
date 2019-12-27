from typing import List

import pytest

from p0994_Rotting_Oranges import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (
        [
            [2, 1, 1],
            [1, 1, 0],
            [0, 1, 1],
        ],
        4,
    ),
    (
        [
            [2, 1, 1],
            [0, 1, 1],
            [1, 0, 1],
        ],
        -1
    ),
    (
        [
            [0, 2],
        ],
        0,
    ),
    (
        [
            [0, 2],
            [2, 2],
        ],
        0,
    ),
))
def test_is_valid(input_value: List[List[int]], expected_result: int, solution: Solution) -> None:
    assert solution.orangesRotting(input_value) == expected_result
