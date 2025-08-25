class Solution 
{
    public long minimumDifference(int[] a) 
    {
        int n = a.length, k = n / 3;
        long[] l = new long[n], r = new long[n];
        long sl = 0, sr = 0, ans = Long.MAX_VALUE;
        PriorityQueue<Integer> hl = new PriorityQueue<>((x, y) -> y - x);
        PriorityQueue<Integer> hr = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            hl.offer(a[i]);
            sl += a[i];
        }
        l[k - 1] = sl;
        for (int i = k; i < n - k; i++) {
            if (a[i] < hl.peek()) {
                sl += a[i] - hl.poll();
                hl.offer(a[i]);
            }
            l[i] = sl;
        }
        for (int i = n - 1; i >= n - k; i--) {
            hr.offer(a[i]);
            sr += a[i];
        }
        r[n - k] = sr;
        for (int i = n - k - 1; i >= k - 1; i--) {
            if (a[i] > hr.peek()) {
                sr += a[i] - hr.poll();
                hr.offer(a[i]);
            }
            r[i] = sr;
        }
        for (int i = k - 1; i < n - k; i++) {
            ans = Math.min(ans, l[i] - r[i + 1]);
        }
        return ans;
    }
}