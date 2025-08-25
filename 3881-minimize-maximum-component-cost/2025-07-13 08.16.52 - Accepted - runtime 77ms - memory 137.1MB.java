import java.util.*;

class Solution {

    static class D {
        int[] p;
        int c;

        D(int n) {
            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;
            c = n;
        }

        int f(int i) {
            return p[i] == i ? i : (p[i] = f(p[i]));
        }

        boolean u(int i, int j) {
            int x = f(i), y = f(j);
            if (x != y) {
                p[x] = y;
                c--;
                return true;
            }
            return false;
        }

        int g() {
            return c;
        }
    }

    public int minCost(int n, int[][] e, int k) {
        int l = 0, h = 1_000_000, a = h;
        while (l <= h) {
            int m = l + (h - l) / 2;
            D d = new D(n);
            for (int[] x : e) {
                if (x[2] <= m) d.u(x[0], x[1]);
            }
            if (d.g() <= k) {
                a = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return a;
    }
}
