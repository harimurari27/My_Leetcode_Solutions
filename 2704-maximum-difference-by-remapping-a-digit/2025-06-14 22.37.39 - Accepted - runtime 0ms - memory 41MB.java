class Solution {
    private int difference(int num) {
        int fnn = -1, fd = -1;
        int rem = num;
        while (rem > 0) {
            int d = rem % 10;
            if (d != 9) fnn = d;
            fd = d;
            rem /= 10;
        }
        rem = num;
        int mi = 0, ma = 0, mul = 1;
        while (rem > 0) {
            int d = rem % 10;
            int md = d, xd = d;
            if (d == fd) md = 0;
            if (d == fnn) xd = 9;
            mi += mul * md;
            ma += mul * xd;
            mul *= 10;
            rem /= 10;
        }

        return ma - mi;
    }
    public int minMaxDifference(int num) {
        return difference(num);
    }
}
