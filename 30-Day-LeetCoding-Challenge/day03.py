from typing import List

import pytest


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        current = nums[0]
        maximum = nums[0]

        for i in range(1, len(nums)):
            current = max(nums[i], nums[i] + current)
            maximum = max(maximum, current)

        return maximum


class TestSolution:
    @pytest.fixture
    def solution(self) -> Solution:
        return Solution()

    @pytest.mark.parametrize('method_name', ('maxSubArray', ))
    @pytest.mark.parametrize(('input_value', 'expected_value'), (
        ([2, -1, 4, -5, 3, 3, 3], 9),
        ([1, 2, 3], 6),
        ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6),
        (
            [
                -84, -87, -78, -16, -94, -36, -87, -93, -50, -22, -63, -28, -91, -60,
                -64, -27, -41, -27, -73, -37, -12, -69, -68, -30, -83, -31, -63, -24,
                -68, -36, -30, -3, -23, -59, -70, -68, -94, -57, -12, -43, -30, -74,
                -22, -20, -85, -38, -99, -25, -16, -71, -14, -27, -92, -81, -57, -74,
                -63, -71, -97, -82, -6, -26, -85, -28, -37, -6, -47, -30, -14, -58, -25,
                -96, -83, -46, -15, -68, -35, -65, -44, -51, -88, -9, -77, -79, -89, -85,
                -4, -52, -55, -100, -33, -61, -77, -69, -40, -13, -27, -87, -95, -40,
            ],
            -3,
        ),
    ))
    def test_single_number(
            self, solution: Solution, method_name: str,
            input_value: List[int], expected_value: int) -> None:

        assert getattr(solution, method_name)(input_value) == expected_value
