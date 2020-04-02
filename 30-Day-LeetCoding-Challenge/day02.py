import pytest


class Solution:
    def isHappy(self, n: int) -> bool:
        pass


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('isHappy', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (19, True),
    ))
    def test_single_number(
            self, solution: Solution, method_name: str,
            input_value: int, expected_value: bool) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
