class Solution 
{
    public boolean checkEqualPartitions(int[] a, long t) 
    {
        int n = a.length;
        for (int m = 1; m < (1 << n) - 1; m++) 
        {
            long p1 = 1, p2 = 1;
            boolean v1 = true, v2 = true;
            for (int i = 0; i < n; i++) 
            {
                if (((m >> i) & 1) == 1) 
                {
                    if (a[i] > t || p1 > t / a[i]) 
                    {
                        v1 = false;
                        break;
                    }
                    p1 *= a[i];
                }
            }
            if (!v1 || p1 != t) continue;
            for (int i = 0; i < n; i++) 
            {
                if (((m >> i) & 1) == 0) 
                {
                    if (a[i] > t || p2 > t / a[i]) 
                    {
                        v2 = false;
                        break;
                    }
                    p2 *= a[i];
                }
            }
            if (v2 && p2 == t) return true;
        }
        return false;
    }
}
