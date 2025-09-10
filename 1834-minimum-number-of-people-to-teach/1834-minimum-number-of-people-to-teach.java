class Solution {
    public int minimumTeachings(int n, int[][] langs, int[][] frnds) {
        Set<Integer> teach = new HashSet<>();
        for (int[] f : frnds) {
            int a = f[0] - 1, b = f[1] - 1;
            boolean ok = false;
            for (int x : langs[a]) {
                for (int y : langs[b]) {
                    if (x == y) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if (!ok) {
                teach.add(a);
                teach.add(b);
            }
        }
        int ans = langs.length + 1;
        for (int l = 1; l <= n; l++) {
            int cnt = 0;
            for (int u : teach) {
                boolean know = false;
                for (int x : langs[u]) {
                    if (x == l) {
                        know = true;
                        break;
                    }
                }
                if (!know) cnt++;
            }
            ans = Math.min(ans, cnt);
        }
        return ans;
    }
}