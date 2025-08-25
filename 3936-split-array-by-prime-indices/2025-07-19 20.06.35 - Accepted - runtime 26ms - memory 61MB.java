class Solution {
    public long splitArray(int[] nums) {
        long a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (p(i)) a += nums[i];
            else b += nums[i];
        }
        return Math.abs(a - b);
    }
    private boolean p(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }
}
