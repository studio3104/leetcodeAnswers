import pytest

from .solution import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('n', 'expected'), (
        (1, 1),
        (3, 27),
        (12, 505379714),
))
def test_solution(n: int, expected: int, solution: Solution) -> None:
    assert solution.concatenatedBinary(n) == expected
