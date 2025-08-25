class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long mx = 0;
        long[] ps = new long[n + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            ps[i + 1] = ps[i] + nums[i];
            pq.offer(new int[]{nums[i], i});
        }
        TreeSet<Integer> st = new TreeSet<>();
        st.add(-1);
        st.add(n);
        while (!pq.isEmpty()) {
            int val = pq.peek()[0];
            List<int[]> lvl = new ArrayList<>();
            while (!pq.isEmpty() && pq.peek()[0] == val) {
                int[] p = pq.poll();
                lvl.add(p);
                int l = st.lower(p[1]);
                int r = st.higher(p[1]);
                mx = Math.max(mx, (long) p[0] * (ps[r] - ps[l + 1]));
            }
            for (int[] p : lvl) st.add(p[1]);
        }
        return (int) (mx % 1000000007);
    }
}
