class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] res = new int[nums.length];
        int t = (1 << maximumBit) - 1;
        int x = 0;
        for (int i = 0; i < nums.length; i++) x ^= nums[i];
        for (int i = 0; i < nums.length; i++) {
            res[i] = t ^ x;
            x ^= nums[nums.length - 1 - i];
        }
        return res;
    }
}
