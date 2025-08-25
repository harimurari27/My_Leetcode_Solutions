import java.util.Arrays;

class Solution {
    private static final int MOD = 1000000007;

    public int countPathsWithXorValue(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][16];

        dp[0][0][grid[0][0]] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < 16; p++) {
                    if (dp[i][j][p] > 0) {
                        if (i + 1 < m) {
                            dp[i + 1][j][p ^ grid[i + 1][j]] = (dp[i + 1][j][p ^ grid[i + 1][j]] + dp[i][j][p]) % MOD;
                        }
                        if (j + 1 < n) {
                            dp[i][j + 1][p ^ grid[i][j + 1]] = (dp[i][j + 1][p ^ grid[i][j + 1]] + dp[i][j][p]) % MOD;
                        }
                    }
                }
            }
        }

        return dp[m - 1][n - 1][k];
    }
}
