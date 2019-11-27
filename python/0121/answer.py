from typing import List

from itertools import groupby


class Solution:
    def __init__(self) -> None:
        self.memo: List[int] = []

    def max_profit(self, prices: List[int], max_profit: int = 0) -> int:
        if len(prices) <= 1:
            return max_profit

        price = prices.pop(0)

        if price not in self.memo:
            self.memo.append(price)

            profit = max(prices) - price

            if max_profit < profit:
                max_profit = profit

        return self.max_profit(prices, max_profit)

    def maxProfit(self, prices: List[int]) -> int:
        prices = [x[0] for x in groupby(prices)]
        return self.max_profit(prices)
