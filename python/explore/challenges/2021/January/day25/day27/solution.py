class Solution:
    def concatenatedBinary(self, n: int) -> int:
        bin_str = ''

        for i in range(1, n + 1):
            bin_str = f"{bin_str}{format(i, 'b')}"

        return int(bin_str, 2) % (pow(10, 9) + 7)
