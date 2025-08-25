class Solution {
    public int countGoodTriplets(int[] nums, int x, int y, int z) {
        int len = nums.length;
        int result = 0;

        for (int p = 0; p < len - 2; p++) {
            for (int q = p + 1; q < len - 1; q++) {
                if (Math.abs(nums[p] - nums[q]) > x) continue;

                for (int r = q + 1; r < len; r++) {
                    if (Math.abs(nums[q] - nums[r]) <= y && Math.abs(nums[p] - nums[r]) <= z) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
