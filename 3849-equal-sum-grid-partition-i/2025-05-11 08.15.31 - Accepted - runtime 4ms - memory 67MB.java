class Solution {
    public boolean canPartitionGrid(int[][] g) {
        int m = g.length, n = g[0].length;
        long t = 0;
        for (int[] r : g)
            for (int v : r) t += v;
        long rs = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) rs += g[i][j];
            if (rs * 2 == t) return true;
        }
        long[] cs = new long[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) cs[j] += g[i][j];

        long csum = 0;
        for (int j = 0; j < n - 1; j++) {
            csum += cs[j];
            if (csum * 2 == t) return true;
        }
        return false;
    }
}
