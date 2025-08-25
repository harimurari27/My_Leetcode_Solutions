class Solution {
    private int findRoot(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findRoot(parent, parent[node]);
        }
        return parent[node];
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] parent = new int[n];
        int[] minPathCost = new int[n];
        Arrays.fill(minPathCost, -1);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int source = edge[0], target = edge[1], weight = edge[2];
            int sourceRoot = findRoot(parent, source);
            int targetRoot = findRoot(parent, target);

            minPathCost[targetRoot] &= weight;

            if (sourceRoot != targetRoot) {
                minPathCost[targetRoot] &= minPathCost[sourceRoot];
                parent[sourceRoot] = targetRoot;
            }
        }

        int[] r = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int start = query[i][0], end = query[i][1];
            if (start == end) {
                r[i] = 0;
            } else if (findRoot(parent, start) != findRoot(parent, end)) {
                r[i] = -1;
            } else {
                r[i] = minPathCost[findRoot(parent, start)];
            }
        }
        return r;
    }
}