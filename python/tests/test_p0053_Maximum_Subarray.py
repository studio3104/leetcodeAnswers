import pytest

from p0053_Maximum_Subarray import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('input_value', 'expected_result'), (
    ([-2, 1, -3, 4, -1, 2, 1, -5, 4], 6),
    ([1, 2, 3, 4], 10),
    ([-1], -1),
    ([-6, -1, 5, 4, 1, -8, 6, 7, -3, 6, 0, -6, -7, 8, -8, -4, 1], 18),
    (
        [
            -84, -87, -78, -16, -94, -36, -87, -93, -50, -22, -63, -28, -91,
            -60, -64, -27, -41, -27, -73, -37, -12, -69, -68, -30, -83, -31,
            -63, -24, -68, -36, -30, -3, -23, -59, -70, -68, -94, -57, -12,
            -43, -30, -74, -22, -20, -85, -38, -99, -25, -16, -71, -14, -27,
            -92, -81, -57, -74, -63, -71, -97, -82, -6, -26, -85, -28, -37,
            -6, -47, -30, -14, -58, -25, -96, -83, -46, -15, -68, -35, -65,
            -44, -51, -88, -9, -77, -79, -89, -85, -4, -52, -55, -100, -33,
            -61, -77, -69, -40, -13, -27, -87, -95, -40
        ],
        -3,
    ),
))
def test_is_valid(input_value: list, expected_result: bool, solution: Solution) -> None:
    assert solution.maxSubArray(input_value) == expected_result
