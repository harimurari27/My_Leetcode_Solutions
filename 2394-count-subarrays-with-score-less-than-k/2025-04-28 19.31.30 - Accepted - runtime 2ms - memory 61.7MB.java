class Solution {
    public long countSubarrays(int[] nums, long k) {
        long r = 0, s = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            while (s * (i - l + 1) >= k) {
                s -= nums[l++];
            }
            r += i - l + 1;
        }
        return r;
    }
}
