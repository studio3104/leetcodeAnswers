from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        num_islands = 0

        for row in grid:
            if '1' not in row:
                continue

            for i, e in enumerate(row):
                if e == '0':
                    continue

                if not num_islands:
                    num_islands += 1

        return num_islands

    def _numIslands(self, grid: List[List[str]]) -> int:
        num_islands = 0
        islands_immediately_before: List[int] = []

        for k, row in enumerate(grid):
        # for row in grid:
            if '1' not in row:
                islands_immediately_before.clear()
                continue

            islands: List[int] = []

            for i, e in enumerate(row):
                if e == '0':
                    continue

                islands.append(i)

                if i - 1 not in islands and i not in islands_immediately_before:
                    if len(row) > 1 and i == 0 and row[1] == '1' and islands_immediately_before:
                        continue

                    print(f'k: {k}, i: {i}')
                    num_islands += 1

            islands_immediately_before = islands

        return num_islands
