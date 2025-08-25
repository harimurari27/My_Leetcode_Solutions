class Solution {
    static final long M = 1000000000 + 7;

    public int possibleStringCount(String word, int k) {
        int n = word.length();
        if (n == k) return 1;

        List<Integer> b = new ArrayList<>();
        int x = 0;

        while (x < n) {
            int y = x + 1;
            while (y < n && word.charAt(y) == word.charAt(y - 1)) y++;
            b.add(y - x);
            x = y;
        }
        int c = b.size();
        long[] m = new long[c];
        m[c - 1] = b.get(c - 1);
        for (x = c - 2; x >= 0; x--) {
            m[x] = (m[x + 1] * b.get(x)) % M;
        }
        if (c >= k) return (int) m[0];
        long[][] d = new long[c][k - c + 1];
        for (x = 0; x < k - c + 1; x++) {
            if (b.get(c - 1) + x + c > k) {
                d[c - 1][x] = b.get(c - 1) - (k - c - x);
            }
        }
        for (x = c - 2; x >= 0; x--) {
            long s = (d[x + 1][k - c] * b.get(x)) % M;
            for (int y = k - c; y >= 0; y--) {
                s += d[x + 1][y];
                if (y + b.get(x) > k - c) {
                    s = (s - d[x + 1][k - c] + M) % M;
                } else {
                    s = (s - d[x + 1][y + b.get(x)] + M) % M;
                }
                d[x][y] = s;
            }
        }
        return (int) d[0][0];
    }
}
