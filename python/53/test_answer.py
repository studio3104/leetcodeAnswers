import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6),
    ([1, 2, 3, 4], 10),
    ([-1], -1),
    ([-6, -1, 5, 4, 1, -8, 6, 7, -3, 6, 0, -6, -7, 8, -8, -4, 1], 18),
))
def test_is_valid(input_value: list, expected_result: bool, solution: Solution) -> None:
    assert solution.maxSubArray(input_value) == expected_result
