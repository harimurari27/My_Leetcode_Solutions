class Solution {
    public int countIslands(int[][] g, int k) {
        int m = g.length, n = g[0].length, c = 0;
        boolean[][] v = new boolean[m][n];
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!v[i][j] && g[i][j] > 0) {
                    int[] s = {0};
                    dfs(g, v, i, j, k, s, d);
                    if (s[0] % k == 0) c++;
                }
            }
        }
        return c;
    }

    void dfs(int[][] g, boolean[][] v, int i, int j, int k, int[] s, int[][] d) {
        int m = g.length, n = g[0].length;
        v[i][j] = true;
        s[0] += g[i][j];
        for (int[] x : d) {
            int ni = i + x[0], nj = j + x[1];
            if (ni >= 0 && nj >= 0 && ni < m && nj < n && !v[ni][nj] && g[ni][nj] > 0)
                dfs(g, v, ni, nj, k, s, d);
        }
    }
}
