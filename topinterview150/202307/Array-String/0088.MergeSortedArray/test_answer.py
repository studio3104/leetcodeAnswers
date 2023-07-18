import pytest

from answer import Solution


@pytest.fixture
def solution() -> Solution:
    return Solution()


@pytest.mark.parametrize(('nums1', 'm', 'nums2', 'n', 'expected'), (
        ([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3, [1, 2, 2, 3, 5, 6]),
        ([1], 1, [], 0, [1]),
        ([-1, 0, 0, 3, 3, 3, 0, 0, 0], 6, [1, 2, 2], 3, [-1, 0, 0, 1, 2, 2, 3, 3, 3])
))
def test_merge(nums1: list[int], m: int, nums2: list[int], n: int, expected: list[int], solution: Solution) -> None:
    solution.merge(nums1, m, nums2, n)
    assert nums1 == expected
