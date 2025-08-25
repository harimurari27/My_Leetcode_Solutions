class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long b = 0, s = 0;
        int c = 0;
        long m = Long.MAX_VALUE;
        long n = Long.MIN_VALUE;
        boolean f = false;
        for (int x : nums) {
            b += x;
            long d = (long)(x ^ k) - x;
            if (d > 0) {
                c++;
                s += d;
                if (d < m) m = d;
            } else {
                if (!f || d > n) {
                    n = d;
                    f = true;
                }
            }
        }
        if ((c & 1) == 0) return b + s;
        long l = m;
        if (f) l = Math.min(l, -n);
        return b + s - l;
    }
}
