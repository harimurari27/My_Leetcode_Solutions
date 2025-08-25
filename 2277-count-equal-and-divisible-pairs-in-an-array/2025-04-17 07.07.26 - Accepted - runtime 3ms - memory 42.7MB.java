class Solution {
    public int countPairs(int[] nums, int k) {
        int i = 0, j = i+ 1 , c = 0;
        for (; i < j; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    c++;
                }
            }

        }
        return c;
    }
}