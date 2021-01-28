class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        if (26 * n - k) % 25 == 0:
            x = (26 * n - k) // 25
            return 'a' * x + 'z' * (n - x)

        temp = 26 * n - k - 26
        if temp < 0:
            x = 0
            y = -temp
        else:
            y = 25 - (temp % 25)
            x = (temp + y) // 25

        return 'a' * x + chr(ord('a') - 1 + y) + 'z' * (n - 1 - x)
