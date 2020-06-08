import pytest


class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n == 0:
            return False
        
        while True:
            if n == 1:
                return True
            n, mod = divmod(n, 2)
            if mod != 0:
                return False


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('isPowerOfTwo', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        (1, True),
        (16, True),
        (218, False),
    ))
    def test_solution(
            self, solution: Solution, method_name: str,
            input_value: int, expected_value: bool) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
