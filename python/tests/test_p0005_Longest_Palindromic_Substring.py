import pytest

from p0005_Longest_Palindromic_Substring import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ('babad', 'aba'),
    ('cbbd', 'bb'),
))
def test_is_valid(input_value: str, expected_result: str, solution: Solution) -> None:
    assert solution.longestPalindrome(input_value) == expected_result
