class Solution:
    _f = {0: 0, 1: 1, 2: 1}

    def fib(self, n: int) -> int:
        if n in self._f:
            return self._f[n]

        self._f[n] = self.fib(n - 1) + self.fib(n - 2)
        return self._f[n]
