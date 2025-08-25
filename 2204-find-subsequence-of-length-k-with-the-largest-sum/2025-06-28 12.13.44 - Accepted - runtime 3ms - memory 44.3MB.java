class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] s = Arrays.copyOf(nums, n);
        Arrays.sort(s);
        int t = s[n - k];
        int c = 0;
        for (int i = n - k; i < n; i++) {
            if (s[i] == t) c++;
        }
        int[] r = new int[k];
        int i = 0;
        for (int x : nums) {
            if (x > t) {
                r[i++] = x;
            } else if (x == t && c > 0) {
                r[i++] = x;
                c--;
            }
            if (i == k) break;
        }
        return r;
    }
}
