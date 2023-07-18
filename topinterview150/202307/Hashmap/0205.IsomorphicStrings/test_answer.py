import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('s', 't', 'expected'), (
        ('egg', 'add', True),
        ('foo', 'bar', False),
        ('paper', 'title', True),
        ('bbbaaaba', 'aaabbbba', False),
))
def test_isIsomorphic(s: str, t: str, expected: bool, solution: Solution) -> None:
    assert solution.isIsomorphic(s, t) is expected
