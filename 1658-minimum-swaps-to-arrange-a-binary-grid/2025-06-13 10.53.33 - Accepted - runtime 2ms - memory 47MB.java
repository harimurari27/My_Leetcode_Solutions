class Solution 
{
    public int minSwaps(int[][] g) 
    {
        int n = g.length;
        int[] z = new int[n]; 
        for (int i = 0; i < n; ++i) {
            int c = 0;
            for (int j = n - 1; j >= 0; --j) {
                if (g[i][j] != 0) break;
                c++;
            }
            z[i] = c;
        }
        int need = n - 1, res = 0;
        while (need > 0) {
            boolean f = false;
            for (int i = n - need - 1; i < n; ++i) {
                if (z[i] >= need) {
                    int t = z[i];
                    for (int k = i; k > n - need - 1; --k)
                        z[k] = z[k - 1];
                    z[n - need - 1] = t;
                    res += i - (n - need - 1);
                    f = true;
                    break;
                }
            }
            if (!f) return -1;
            need--;
        }
        return res;
    }
}
