from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        h = {i: n for i, n in enumerate(nums)}

        found = False
        finding = 0
        answer = []

        for i, n in h.items():
            if found and n == finding:
                answer.append(i)
                break

            sub = target - n
            nums.pop(0)

            if sub in nums:
                found = True
                finding = sub
                answer.append(i)

        return answer
