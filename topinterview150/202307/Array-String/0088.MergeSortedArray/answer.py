class Solution:
    """
    https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
    """
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        for i in range(n):
            nums1[i + m] = nums2[i]

        nums1.sort()
