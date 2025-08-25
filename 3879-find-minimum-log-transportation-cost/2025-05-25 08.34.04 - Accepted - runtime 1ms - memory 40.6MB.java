class Solution 
{
    public long minCuttingCost(int n, int m, int k) 
    {
        if (n <= k && m <= k) 
        {
            return 0;
        }
        long ct = 0;
        if (n > k) 
        {
            ct += (long)(n - k) * k;
        }
        if (m > k) 
        {
            ct += (long)(m - k) * k;
        }
        return ct;
    }
}
