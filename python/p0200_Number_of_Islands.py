from typing import List


class Solution:
    def _mark_neighbors(self, i_col: int, i_row: int) -> None:
        if i_col < 0 or i_row < 0:
            return

        if i_col >= self.num_columns or i_row >= self.num_rows:
            return

        if self.grid[i_col][i_row] != '1':
            return

        self.grid[i_col][i_row] = ''
        self._mark_neighbors(i_col, i_row + 1)  # right
        self._mark_neighbors(i_col, i_row - 1)  # left
        self._mark_neighbors(i_col - 1, i_row)  # up
        self._mark_neighbors(i_col + 1, i_row)  # down

    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        self.grid = grid
        self.num_columns = len(grid)
        self.num_rows = len(grid[-1])
        num_islands = 0

        for i_col in range(self.num_columns):
            for i_row in range(self.num_rows):
                if self.grid[i_col][i_row] == '1':
                    num_islands += 1
                    self._mark_neighbors(i_col, i_row)

        return num_islands
