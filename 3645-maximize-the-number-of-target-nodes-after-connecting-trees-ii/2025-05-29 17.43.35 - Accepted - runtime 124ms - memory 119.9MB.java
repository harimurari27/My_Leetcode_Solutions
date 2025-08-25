class Solution 
{
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) 
    {
        int n = edges1.length + 1, m = edges2.length + 1;
        List<List<Integer>> g1 = buildGraph(edges1, n), g2 = buildGraph(edges2, m);
        int[] c1 = new int[2], nc1 = new int[n], c2 = new int[2], nc2 = new int[m];
        bfsColoring(g1, c1, nc1);
        bfsColoring(g2, c2, nc2);
        int mx = Math.max(c2[0], c2[1]);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = c1[nc1[i]] + mx;
        return res;
    }
    public List<List<Integer>> buildGraph(int[][] e, int sz) 
    {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < sz; i++) g.add(new ArrayList<>());
        for (int[] ed : e) 
        {
            g.get(ed[0]).add(ed[1]);
            g.get(ed[1]).add(ed[0]);
        }
        return g;
    }
    public void bfsColoring(List<List<Integer>> g, int[] cnt, int[] col) 
    {
        int n = g.size();
        boolean[] vis = new boolean[n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        vis[0] = true;
        while (!q.isEmpty()) 
        {
            int[] cur = q.poll();
            int u = cur[0], c = cur[1];
            col[u] = c;
            cnt[c]++;
            for (int v : g.get(u)) 
            {
                if (!vis[v]) 
                {
                    vis[v] = true;
                    q.offer(new int[]{v, 1 - c});
                }
            }
        }
    }
}
