class Solution {
    public int kInversePairs(int n, int k) {
        int m = 1000000007;
        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] nd = new int[k + 1];
            int s = 0;
            for (int j = 0; j <= k; j++) {
                s = (s + dp[j]) % m;
                if (j >= i) {
                    s = (s - dp[j - i]);
                    if (s < 0) s += m;
                }
                nd[j] = s;
            }
            dp = nd;
        }
        return dp[k];
    }
}
