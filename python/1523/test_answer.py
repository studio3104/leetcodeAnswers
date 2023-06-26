from typing import List, Optional

import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('low', 'high', 'expect'), (
    (3, 7, 3),
    (8, 10, 1),
    (0, 10, 5),
    (14, 17, 2),
    (21, 22, 1),
))
def test_count_odd(low: int, high: int, expect: int, solution: Solution) -> None:
    assert solution.countOdds(low, high) == expect
