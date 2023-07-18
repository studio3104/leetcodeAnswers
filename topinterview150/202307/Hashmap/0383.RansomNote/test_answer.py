import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('ransomNote', 'magazine', 'expected'), (
        ('a', 'b', False),
        ('aa', 'ab', False),
        ('aa', 'aab', True),
))
def test_can_construct(ransomNote: str, magazine: str, expected: bool, solution: Solution) -> None:
    assert solution.canConstruct(ransomNote, magazine) is expected
