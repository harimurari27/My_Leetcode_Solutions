class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1, gcd = 0, lcm = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = gcd == 0 ? nums[j] : gcd(gcd, nums[j]);
                lcm = lcm / gcd(lcm, nums[j]) * nums[j];
                if (prod == lcm * gcd) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
