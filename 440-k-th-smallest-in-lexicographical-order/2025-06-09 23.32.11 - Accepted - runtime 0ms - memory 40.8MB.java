class Solution {
    public int findKthNumber(int n, int k) {
        long c = 1;
        k -= 1; 
        while (k > 0) {
            long count = getCount(c, n);
            if (count <= k) {
                c++;
                k -= count;
            } else {
                c *= 10;
                k -= 1;
            }
        }
        return (int) c;
    }

    private long getCount(long prefix, long n) {
        long count = 0;
        long current = prefix;
        long next = prefix + 1;
        while (current <= n) {
            count += Math.min(n + 1, next) - current;
            current *= 10;
            next *= 10;
        }
        return count;
    }
}