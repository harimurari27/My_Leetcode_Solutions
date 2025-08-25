import java.util.Arrays;

class Solution {
    private static final int M = 1_000_000_007;
    private static final int N = 41;
    private static final long[] F = new long[N];
    private static final long[] IF = new long[N];

    static {
        initF();
        initIF();
    }

    private static void initF() {
        F[0] = 1;
        for (int i = 1; i < N; i++) {
            F[i] = F[i - 1] * i % M;
        }
    }

    private static void initIF() {
        IF[N - 1] = pow(F[N - 1], M - 2);
        for (int i = N - 1; i > 0; i--) {
            IF[i - 1] = IF[i] * i % M;
        }
    }

    public int countBalancedPermutations(String s) {
        int[] cnt = countDigits(s);
        int sum = digitSum(s);
        if (sum % 2 != 0) return 0;
        for (int i = 1; i < 10; i++) {
            cnt[i] += cnt[i - 1];
        }
        int len = s.length(), h = len / 2;
        int[][][] dp = initDP(h, sum);
        return (int) (F[h] * F[len - h] % M * dfs(9, h, sum / 2, cnt, dp) % M);
    }

    private int[] countDigits(String s) {
        int[] a = new int[10];
        for (char c : s.toCharArray()) {
            a[c - '0']++;
        }
        return a;
    }

    private int digitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) sum += c - '0';
        return sum;
    }

    private int[][][] initDP(int h, int sum) {
        int[][][] dp = new int[10][h + 1][sum / 2 + 1];
        for (int[][] m : dp)
            for (int[] r : m)
                Arrays.fill(r, -1);
        return dp;
    }

    private int dfs(int d, int l, int s, int[] cnt, int[][][] dp) {
        if (d < 0) return s == 0 ? 1 : 0;
        if (dp[d][l][s] != -1) return dp[d][l][s];
        long res = 0;
        int c = cnt[d] - (d > 0 ? cnt[d - 1] : 0);
        int r = cnt[d] - l;
        for (int k = Math.max(c - r, 0); k <= Math.min(c, l) && k * d <= s; k++) {
            long sub = dfs(d - 1, l - k, s - k * d, cnt, dp);
            res = (res + sub * IF[k] % M * IF[c - k]) % M;
        }
        dp[d][l][s] = (int) res;
        return (int) res;
    }

    private static long pow(long b, int e) {
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) r = r * b % M;
            b = b * b % M;
            e >>= 1;
        }
        return r;
    }
}
