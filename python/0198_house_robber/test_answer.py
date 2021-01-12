from typing import List

import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([1, 2, 3], 4),
    ([1, 2, 3, 1], 4),
    ([2, 7, 9, 3, 1], 12),
    ([1, 5, 6, 2, 2, 4, 2, 3, 1], 14),
    ([1, 2, 3, 4, 5, 5, 6, 2, 2, 4, 2, 3, 1], 22),
    ([155, 44, 52, 58, 250, 225, 109, 118, 211, 73, 137, 96, 137, 89, 174, 66, 134, 26, 25, 205, 239, 85, 146, 73, 55, 6, 122, 196, 128, 50, 61, 230, 94, 208, 46, 243, 105, 81, 157, 89, 205, 78, 249, 203, 238, 239, 217, 212, 241, 242, 157, 79, 133, 66, 36, 165], 4517),  # noqa
))
def test_is_valid(input_value: List[int], expected_result: int, solution: Solution) -> None:
    assert solution.rob(input_value) == expected_result
