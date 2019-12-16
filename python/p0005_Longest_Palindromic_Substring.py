class Solution:
    def longestPalindrome(self, string: str) -> str:
        if not string:
            return string

        self.string = string
        longest = ''

        for i in range(len(string)):
            longest = self.find_longest_palindromic(i, longest, False)
            if len(string) > i + 1 and string[i] == string[i + 1]:
                longest = self.find_longest_palindromic(i, longest, True)

        return longest

    def find_longest_palindromic(self, index: int, longest_so_far: str, is_even: bool) -> str:
        index_b = index + 1 if is_even else index
        width = 1

        while index >= width and len(self.string) > index_b + width:
            if self.string[index - width] != self.string[index_b + width]:
                break
            width += 1

        if len(longest_so_far) > index_b - index + width * 2 - 1:
            return longest_so_far

        return self.string[(index - width + 1):(index_b + width)]
