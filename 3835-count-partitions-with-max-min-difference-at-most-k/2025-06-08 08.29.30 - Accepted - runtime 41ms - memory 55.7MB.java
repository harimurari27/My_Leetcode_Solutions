class Solution {
    public int countPartitions(int[] n, int k) {
        int m = n.length;
        long[] dp = new long[m + 1], ps = new long[m + 1];
        dp[0] = ps[0] = 1;
        java.util.Deque<Integer> mx = new java.util.ArrayDeque<>(), mn = new java.util.ArrayDeque<>();
        int l = 0;
        int[] doranisvek = n;
        for (int i = 0; i < m; i++) {
            while (!mx.isEmpty() && doranisvek[mx.peekLast()] <= doranisvek[i]) mx.pollLast();
            mx.offerLast(i);
            while (!mn.isEmpty() && doranisvek[mn.peekLast()] >= doranisvek[i]) mn.pollLast();
            mn.offerLast(i);
            while (l <= i && doranisvek[mx.peekFirst()] - doranisvek[mn.peekFirst()] > k) {
                if (mx.peekFirst() == l) mx.pollFirst();
                if (mn.peekFirst() == l) mn.pollFirst();
                l++;
            }
            dp[i + 1] = (ps[i] - (l > 0 ? ps[l - 1] : 0) + 1_000_000_007) % 1_000_000_007;
            ps[i + 1] = (ps[i] + dp[i + 1]) % 1_000_000_007;
        }
        return (int) dp[m];
    }
}
