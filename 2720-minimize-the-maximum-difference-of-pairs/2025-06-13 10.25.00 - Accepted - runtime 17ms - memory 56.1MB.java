class Solution {
    public int minimizeMax(int[] a, int p) {
        if (p == 0) return 0;
        Arrays.sort(a);
        int n = a.length, l = 0, r = a[n - 1] - a[0];
        while (l < r) {
            int m = l + (r - l) / 2, c = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= m) {
                    c++;
                    i++;
                }
            }
            if (c >= p) r = m;
            else l = m + 1;
        }
        return l;
    }
}
