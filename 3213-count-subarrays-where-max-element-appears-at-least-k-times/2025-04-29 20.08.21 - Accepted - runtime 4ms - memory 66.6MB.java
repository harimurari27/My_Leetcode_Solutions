class Solution {
    public long countSubarrays(int[] a, int k) {
        int m = Integer.MIN_VALUE;
        for (int n : a) m = Math.max(m, n);
        int l = 0;
        long cnt = 0, res = 0;
        for (int r = 0; r < a.length; r++) {
            if (a[r] == m) cnt++;
            while (cnt >= k) {
                if (a[l] == m) cnt--;
                l++;
            }
            res += l;
        }
        return res;
    }
}
