import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('n', 'expect'), (
        (2, 1),
        (3, 2),
        (4, 3),
))
def test_unique_occurrences(n: int, expect: int, solution: Solution) -> None:
    assert solution.fib(n) == expect
