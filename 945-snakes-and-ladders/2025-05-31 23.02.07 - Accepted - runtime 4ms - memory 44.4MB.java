class Solution 
{
    public int snakesAndLadders(int[][] board) 
    {
        int n = board.length, i = 1, dir = 1;
        int[] a = new int[n * n + 1];
        for (int r = n - 1; r >= 0; r--, dir *= -1) 
        {
            if (dir == 1) 
            {
                for (int c = 0; c < n; c++) a[i++] = board[r][c];
            } else 
            {
                for (int c = n - 1; c >= 0; c--) a[i++] = board[r][c];
            }
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n * n + 1];
        q.offer(1);
        vis[1] = true;
        int m = 0;
        while (!q.isEmpty()) 
        {
            int sz = q.size();
            while (sz-- > 0) 
            {
                int x = q.poll();
                if (x == n * n) return m;
                for (int d = 1; d <= 6 && x + d <= n * n; d++) 
                {
                    int y = x + d;
                    if (a[y] != -1) y = a[y];
                    if (!vis[y]) 
                    {
                        vis[y] = true;
                        q.offer(y);
                    }
                }
            }
            m++;
        }
        return -1;
    }
}
