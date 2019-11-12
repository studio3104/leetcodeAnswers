from functools import lru_cache


@lru_cache(maxsize=None)
def fib(n: int) -> int:
    if n < 2:
        return n
    return fib(n - 1) + fib(n - 2)


class Solution:
    def climbStairs(self, n: int) -> int:
        return fib(n + 1)
