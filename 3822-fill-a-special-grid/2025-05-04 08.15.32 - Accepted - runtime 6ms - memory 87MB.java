class Solution {
    public int[][] specialGrid(int n) {
        return build(n);
    }
    private int[][] build(int n) {
        if (n == 0) return new int[][]{{0}};
        int[][] g = build(n - 1);
        int s = g.length, ns = s * 2, off = s * s;
        int[][] res = new int[ns][ns];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                int v = g[i][j];
                res[i][j + s] = v;
                res[i + s][j + s] = v + off;
                res[i + s][j] = v + 2 * off;
                res[i][j] = v + 3 * off;
            }
        }
        return res;
    }
}
