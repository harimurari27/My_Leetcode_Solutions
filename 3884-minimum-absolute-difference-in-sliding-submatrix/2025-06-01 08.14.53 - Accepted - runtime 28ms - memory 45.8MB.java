class Solution 
{
    public int[][] minAbsDiff(int[][] g, int k) 
    {
        int m = g.length, n = g[0].length;
        int[][] a = new int[m - k + 1][n - k + 1];
        for (int i = 0; i <= m - k; i++) 
        {
            for (int j = 0; j <= n - k; j++) 
            {
                TreeSet<Integer> s = new TreeSet<>();
                for (int x = 0; x < k; x++)
                    for (int y = 0; y < k; y++)
                        s.add(g[i + x][j + y]);
                if (s.size() <= 1) a[i][j] = 0;
                else 
                {
                    int prev = s.first(), min = Integer.MAX_VALUE;
                    for (int val : s.tailSet(prev, false)) 
                    {
                        min = Math.min(min, val - prev);
                        prev = val;
                    }
                    a[i][j] = min;
                }
            }
        }
        return a;
    }
}
