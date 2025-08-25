class Solution {
    public int numSubmat(int[][] a) {
        int n = a.length, m = a[0].length;
        int[][] h = new int[n][m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) h[i][j] = 0;
                else h[i][j] = (i == 0 ? 1 : h[i-1][j] + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int mn = Integer.MAX_VALUE;
                for (int k = j; k >= 0; k--) {
                    if (h[i][k] == 0) break;
                    mn = Math.min(mn, h[i][k]);
                    ans += mn;
                }
            }
        }
        return ans;
    }
}
