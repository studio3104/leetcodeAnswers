class Solution:
    def concatenatedBinary(self, n: int) -> int:
        bin_str = ''.join(format(i, 'b') for i in range(n + 1))
        return int(bin_str, 2) % (pow(10, 9) + 7)
