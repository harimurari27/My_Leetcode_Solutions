class Solution {
  public int[] maxTargetNodes(int[][] e1, int[][] e2, int k) {
    int n1 = e1.length + 1, n2 = e2.length + 1;
    int[] res = new int[n1];
    List<Integer>[] g1 = buildGraph(e1);
    List<Integer>[] g2 = buildGraph(e2);
    int max = 0;
    if (k > 0)
      for (int i = 0; i < n2; ++i)
        max = Math.max(max, dfs(g2, i, -1, k - 1));
    for (int i = 0; i < n1; ++i)
      res[i] = max + dfs(g1, i, -1, k);
    return res;
  }
  private int dfs(List<Integer>[] g, int u, int p, int k) {
    if (k == 0) return 1;
    int cnt = 0;
    for (int v : g[u])
      if (v != p)
        cnt += dfs(g, v, u, k - 1);
    return 1 + cnt;
  }
  private List<Integer>[] buildGraph(int[][] e) {
    int n = e.length + 1;
    List<Integer>[] g = new ArrayList[n];
    for (int i = 0; i < n; ++i)
      g[i] = new ArrayList<>();
    for (int[] ed : e) {
      int u = ed[0], v = ed[1];
      g[u].add(v);
      g[v].add(u);
    }
    return g;
  }
}
