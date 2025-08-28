class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int row = 0; row < n; row++) {
            sortDiagonal(grid, row, 0, false);
        }
        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, 0, col, true);
        }

        return grid;
    }

    private void sortDiagonal(int[][] grid, int startRow, int startCol, boolean increasing) {
        int n = grid.length;
        int count = 0;
        int i = startRow, j = startCol;
        while (i < n && j < n) {
            count++;
            i++;
            j++;
        }
        for (int k = 0; k < count - 1; k++) {
            for (int l = 0; l < count - 1 - k; l++) {
                int row1 = startRow + l;
                int col1 = startCol + l;
                int row2 = startRow + l + 1;
                int col2 = startCol + l + 1;
                if ((increasing && grid[row1][col1] > grid[row2][col2]) || 
                    (!increasing && grid[row1][col1] < grid[row2][col2])) {
                    int temp = grid[row1][col1];
                    grid[row1][col1] = grid[row2][col2];
                    grid[row2][col2] = temp;
                }
            }
        }
    }
}