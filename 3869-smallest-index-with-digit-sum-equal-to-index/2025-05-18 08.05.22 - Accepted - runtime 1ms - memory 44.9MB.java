class Solution {
    public int smallestIndex(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int s = 0, n = a[i];
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            if (s == i) return i;
        }
        return -1;
    }
}
