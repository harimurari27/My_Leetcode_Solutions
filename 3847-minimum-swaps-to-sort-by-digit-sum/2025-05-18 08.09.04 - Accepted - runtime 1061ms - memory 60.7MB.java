class Solution 
{
    public int minSwaps(int[] a) 
    {
        int n = a.length, res = 0;
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) b[i] = new int[]{a[i], i};
        Arrays.sort(b, (x, y) -> 
        {
            int sx = ds(x[0]), sy = ds(y[0]);
            return sx == sy ? x[0] - y[0] : sx - sy;
        });
        boolean[] v = new boolean[n];
        for (int i = 0; i < n; i++) 
        {
            if (v[i] || b[i][1] == i) continue;
            int c = 0, j = i;
            while (!v[j]) 
            {
                v[j] = true;
                j = b[j][1];
                c++;
            }
            res += c - 1;
        }
        return res;
    }
    int ds(int x) 
    {
        int s = 0;
        while (x > 0) 
        {
            s += x % 10;
            x /= 10;
        }
        return s;
    }
}
