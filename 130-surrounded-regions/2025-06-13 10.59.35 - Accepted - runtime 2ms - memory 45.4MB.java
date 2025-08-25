class Solution {
    public void dfs(int r, int c, int[][] v, char[][] b, int[] dr, int[] dc) {
        v[r][c] = 1;
        int n = b.length, m = b[0].length;
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && v[nr][nc] == 0 && b[nr][nc] == 'O') {
                dfs(nr, nc, v, b, dr, dc);
            }
        }
    }
    public void solve(char[][] b) {
        int[] dr = {-1, 0, 1, 0}, dc = {0, 1, 0, -1};
        int n = b.length, m = b[0].length;
        int[][] v = new int[n][m];
        for (int i = 0; i < m; i++) {
            if (v[0][i] == 0 && b[0][i] == 'O') dfs(0, i, v, b, dr, dc);
            if (v[n - 1][i] == 0 && b[n - 1][i] == 'O') dfs(n - 1, i, v, b, dr, dc);
        }
        for (int i = 0; i < n; i++) {
            if (v[i][0] == 0 && b[i][0] == 'O') dfs(i, 0, v, b, dr, dc);
            if (v[i][m - 1] == 0 && b[i][m - 1] == 'O') dfs(i, m - 1, v, b, dr, dc);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] == 0 && b[i][j] == 'O') {
                    b[i][j] = 'X';
                }
            }
        }
    }
}
