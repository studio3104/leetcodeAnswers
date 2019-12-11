import pytest

from p0020_Valid_Parentheses import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ('()', True),
    ('()[]{}', True),
    ('(]', False),
    ('([)]', False),
    ('{[]}', True),
    ('[])', False),
    ('(([]){})', True),
    ('', True),
    ('[', False)
))
def test_is_valid(input_value: str, expected_result: bool, solution: Solution) -> None:
    assert solution.isValid(input_value) is expected_result
