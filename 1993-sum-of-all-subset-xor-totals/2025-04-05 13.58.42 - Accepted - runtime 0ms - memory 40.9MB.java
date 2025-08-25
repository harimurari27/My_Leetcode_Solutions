class Solution {
    public int subsetXORSum(int[] nums) {
        int t = 0;
        int n=nums.length;
        for (int num : nums) {
            t |= num;  
        }
        return t * (1 << (n - 1));
    }
}