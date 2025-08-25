class Solution 
{
    private static final int M = 1000000007;
    private long p(long b, int e) 
    {
        long r = 1;
        while (e > 0) 
        {
            if ((e & 1) == 1) r = (r * b) % M;
            b = (b * b) % M;
            e >>= 1;
        }
        return r;
    }
    public int countGoodArrays(int n, int m, int k) 
    {
        int d = n - 1;
        if (k > d) return 0;
        int r = k;
        if (r > d - r) r = d - r;
        long c = 1;
        if (r > 0) 
        {
            int[] inv = new int[r + 1];
            inv[1] = 1;
            for (int i = 2; i <= r; ++i) 
            {
                inv[i] = (int)((M - (long)(M / i) * inv[M % i] % M) % M);
            }
            for (int i = 1; i <= r; ++i) 
            {
                c = c * (d - r + i) % M;
                c = c * inv[i] % M;
            }
        }
        return (int)((long)m * c % M * p(m - 1, d - k) % M);
    }
}
