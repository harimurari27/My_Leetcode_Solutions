class Solution {
    public int maxCandies(int[] v, int[] c, int[][] k, int[][] cb, int[] ib) {
        boolean f = true;
        int t = 0;
        List<Integer> b = new ArrayList<>();
        for (int i : ib) b.add(i);
        while (!b.isEmpty() && f) {
            f = false;
            List<Integer> nb = new ArrayList<>();
            for (int i : b) {
                if (v[i] == 1) {
                    f = true;
                    for (int j : cb[i]) nb.add(j);
                    for (int j : k[i]) v[j] = 1;
                    t += c[i];
                } else {
                    nb.add(i);
                }
            }
            b = nb;
        }
        return t;
    }
}
