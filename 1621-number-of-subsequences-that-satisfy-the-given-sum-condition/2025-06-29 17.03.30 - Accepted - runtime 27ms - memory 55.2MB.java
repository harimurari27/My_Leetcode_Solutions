class Solution {
    int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums); 
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int l = 0, r = n - 1, ans = 0;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                ans = (ans + power[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }

        return ans;
    }
}