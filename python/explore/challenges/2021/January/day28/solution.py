class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        chars = []

        while n > 0:
            d, m = divmod((k - n + 1), 26)
            o = m if d == 0 else 26
            k -= o
            chars.append(o)
            n -= 1

        return ''.join([chr(c + ord('a') - 1) for c in reversed(chars)])
