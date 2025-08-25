import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> f = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) f.offer(i);

        PriorityQueue<long[]> b =
            new PriorityQueue<>((x, y) -> x[0] == y[0] ? Long.compare(x[1], y[1])
                                                       : Long.compare(x[0], y[0]));

        int[] c = new int[n];

        for (int[] m : meetings) {
            long s = m[0], e = m[1];

            while (!b.isEmpty() && b.peek()[0] <= s)
                f.offer((int) b.poll()[1]);

            int r;
            long ne;
            if (!f.isEmpty()) {
                r = f.poll();
                ne = e;
            } else {
                long[] p = b.poll();
                r = (int) p[1];
                ne = p[0] + (e - s);
            }
            b.offer(new long[] {ne, r});
            c[r]++;
        }

        int res = 0;
        for (int i = 1; i < n; ++i)
            if (c[i] > c[res]) res = i;
        return res;
    }
}
