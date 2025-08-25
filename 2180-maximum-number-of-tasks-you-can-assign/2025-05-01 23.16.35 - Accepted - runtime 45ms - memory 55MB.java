class Solution {
    public int maxTaskAssign(int[] t, int[] w, int p, int s) {
        Arrays.sort(t);
        Arrays.sort(w);
        int l = 0, h = Math.min(t.length, w.length);
        while (l < h) {
            int m = (l + h + 1) / 2;
            if (canAssign(t, w, p, s, m)) {
                l = m;
            } else {
                h = m - 1;
            }
        }
        return l;
    }
    private boolean canAssign(int[] t, int[] w, int p, int s, int c) {
        Deque<Integer> q = new ArrayDeque<>();
        int i = w.length - 1;
        int r = p;
        for (int j = c - 1; j >= 0; j--) {
            int task = t[j];
            if (!q.isEmpty() && q.peekFirst() >= task) {
                q.pollFirst();
            } else if (i >= 0 && w[i] >= task) {
                i--;
            } else {
                while (i >= 0 && w[i] + s >= task) {
                    q.addLast(w[i--]);
                }
                if (q.isEmpty() || r == 0) {
                    return false;
                }
                q.pollLast();
                r--;
            }
        }
        return true;
    }
}
