class Solution {
    public int findTheCity(int n, int[][] e, int d) {
        int[][] dis = new int[n][n];
        int inf = (int) 1e7;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dis[i], inf);
            dis[i][i] = 0;
        }
        for (int[] x : e) {
            int u = x[0], v = x[1], c = x[2];
            dis[u][v] = c;
            dis[v][u] = c;
        }
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
        int res = 0, mn = inf;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dis[i][j] <= d) cnt++;
            }
            if (cnt <= mn) {
                mn = cnt;
                res = i;
            }
        }
        return res;
    }
}
