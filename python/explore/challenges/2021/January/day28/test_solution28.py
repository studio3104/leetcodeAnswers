import pytest

from .solution import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('n', 'k', 'expected'), (
        (3, 27, 'aay'),
        (5, 73, 'aaszz'),
))
def test_solution(n: int, k: int, expected: str, solution: Solution) -> None:
    assert solution.getSmallestString(n, k) == expected
