class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> g = new ArrayList<>();
        int[] deg = new int[n];
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            deg[e[1]]++;
        }
        int[][] dp = new int[n][26];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (deg[i] == 0) q.offer(i);
        int vis = 0, res = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            vis++;
            int c = colors.charAt(u) - 'a';
            dp[u][c]++;
            res = Math.max(res, dp[u][c]);
            for (int v : g.get(u)) {
                for (int j = 0; j < 26; j++) dp[v][j] = Math.max(dp[v][j], dp[u][j]);
                if (--deg[v] == 0) q.offer(v);
            }
        }
        return vis == n ? res : -1;
    }
}
