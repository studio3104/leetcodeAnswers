from typing import List


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        m = 0
        for account in accounts:
            m = max(m, sum(account))
        return m
