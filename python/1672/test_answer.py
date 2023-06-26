import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('accounts', 'expect'), (
        ([[1, 2, 3], [3, 2, 1]], 6),
        ([[1, 5], [7, 3], [3, 5]], 10),
        ([[2, 8, 7], [7, 1, 3], [1, 9, 5]], 17),
))
def test_unique_occurrences(accounts: list[list[int]], expect: int, solution: Solution) -> None:
    assert solution.maximumWealth(accounts) == expect
