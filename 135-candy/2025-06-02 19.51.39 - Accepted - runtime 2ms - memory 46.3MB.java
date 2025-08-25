class Solution {
    public int candy(int[] r) {
        int n = r.length, sum = 0;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) c[i] = 1;
        for (int i = 1; i < n; i++)
            if (r[i] > r[i - 1])
                c[i] = c[i - 1] + 1;
        for (int i = n - 1; i > 0; i--) {
            if (r[i - 1] > r[i])
                c[i - 1] = Math.max(c[i] + 1, c[i - 1]);
            sum += c[i - 1];
        }
        return sum + c[n - 1];
    }
}
