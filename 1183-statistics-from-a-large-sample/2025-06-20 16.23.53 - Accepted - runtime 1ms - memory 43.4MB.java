class Solution {
    public double[] sampleStats(int[] cnt) {
        int mk = 0, mv = -1;
        long sum = 0;
        int total = 0;
        double min = -1, max = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                if (min == -1) min = i;
                if (cnt[i] > mv) {
                    mv = cnt[i];
                    mk = i;
                }
                max = i;
                sum += (long) i * cnt[i];
                total += cnt[i];
            }
        }
        return new double[]{min, max, sum / (double) total, med(total, cnt), mk};
    }
    private double med(int t, int[] cnt) {
        if (t % 2 == 1) {
            return odd(cnt, t / 2 + 1);
        } else {
            return even(cnt, t / 2);
        }
    }
    private double odd(int[] cnt, int tgt) {
        int csf = 0, m = -1;
        for (int i = 0; i < cnt.length; i++) {
            csf += cnt[i];
            if (csf >= tgt) {
                m = i;
                break;
            }
        }
        return m;
    }
    private double even(int[] cnt, int tgt) {
        double l = 0, r = 0;
        int csf = 0;
        for (int i = 0; i < cnt.length; i++) {
            csf += cnt[i];
            if (csf >= tgt + 1) {
                l = r = i;
                break;
            } else if (csf == tgt) {
                l = i;
                for (int k = i + 1; k < cnt.length; k++) {
                    if (cnt[k] != 0) {
                        r = k;
                        break;
                    }
                }
                break;
            }
        }
        return (l + r) / 2;
    }
}
