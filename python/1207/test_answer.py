import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('arr', 'expect'), (
        ([1, 2, 2, 1, 1, 3], True),
        ([1, 2], False),
        ([-3, 0, 1, -3, 1, 1, 1, -3, 10, 0], True),
))
def test_unique_occurrences(arr: list[int], expect: bool, solution: Solution) -> None:
    assert solution.uniqueOccurrences(arr) is expect
