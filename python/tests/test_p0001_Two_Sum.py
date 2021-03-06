import pytest

from p0001_Two_Sum import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    (([2, 7, 11, 15], 9), [0, 1]),
    (([3, 2, 4], 6), [1, 2]),
    (([3, 3], 6), [0, 1]),
))
def test_is_valid(input_value: str, expected_result: bool, solution: Solution) -> None:
    assert solution.twoSum(*input_value) == expected_result
