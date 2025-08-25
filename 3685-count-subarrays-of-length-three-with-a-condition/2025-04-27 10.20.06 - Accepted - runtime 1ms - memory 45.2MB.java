class Solution {
    public int countSubarrays(int[] nums) {
        int co = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (a + c == b / 2.0) {
                co++;
            }
        }
        
        return co;
    }
}
