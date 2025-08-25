class Solution {
    public char processStr(String s, long k) {
        String t = s;
        int n = s.length();
        long[] l = new long[n];
        char[] o = new char[n];
        long cur = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            o[i] = c;
            if (c >= 'a' && c <= 'z') {
                cur++;
            } else if (c == '*') {
                cur = Math.max(0, cur - 1);
            } else if (c == '#') {
                cur = Math.min(cur * 2, (long) 1e15);
            } else if (c == '%') {
            }
            l[i] = cur;
        }

        if (k >= l[n - 1]) return '.';

        for (int i = n - 1; i >= 0; i--) {
            char c = o[i];
            long pre = i > 0 ? l[i - 1] : 0;
            if (c >= 'a' && c <= 'z') {
                if (l[i] == 0) continue;
                if (k == l[i] - 1) return c;
                k = Math.min(k, l[i] - 1);
            } else if (c == '*') {
                if (l[i] < pre) {
                    if (k >= l[i]) return '.';
                }
            } else if (c == '#') {
                if (k >= pre) k -= pre;
            } else if (c == '%') {
                k = pre - 1 - k;
            }
        }
        return '.';
    }
}
