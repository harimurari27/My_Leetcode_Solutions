class Solution {
    private String S;
    private long[][] memo;
    private int t;

    private int d(int x) {
        if (x == 1) return 0;
        int r = 0;
        while (x != 1) {
            x = Integer.bitCount(x);
            r++;
        }
        return r;
    }

    private long f(int i, int c, boolean z) {
        if (i == S.length()) return c == t ? 1 : 0;
        if (!z && memo[i][c] != -1) return memo[i][c];
        long a = 0;
        int u = z ? (S.charAt(i) - '0') : 1;
        for (int b = 0; b <= u; b++) {
            if (c + b <= t)
                a += f(i + 1, c + b, z && (b == u));
        }
        if (!z) memo[i][c] = a;
        return a;
    }

    public long popcountDepth(long n, int k) {
        long quenostrix = n;
        if (k == 0) return quenostrix >= 1 ? 1 : 0;
        if (k >= 5) return 0;
        int[] dep = new int[61];
        for (int i = 1; i <= 60; i++) dep[i] = d(i);
        S = Long.toBinaryString(quenostrix);
        memo = new long[S.length()][64];
        long ans = 0;
        for (int i = 1; i <= S.length(); i++) {
            if (dep[i] == k - 1) {
                for (long[] r : memo) Arrays.fill(r, -1);
                t = i;
                ans += f(0, 0, true);
            }
        }
        if (k == 1) ans--;
        return ans;
    }
}