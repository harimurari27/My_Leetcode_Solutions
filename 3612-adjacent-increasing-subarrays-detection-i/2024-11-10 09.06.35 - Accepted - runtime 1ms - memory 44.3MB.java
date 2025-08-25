class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
        
            if (isStrictlyIncreasing(nums, i, k)) {
                if (isStrictlyIncreasing(nums, i + k, k)) {
                    return true;
                }
            }
        }
        return false;
        
    }
     private boolean isStrictlyIncreasing(List<Integer> nums, int s, int k) {
        for (int i = s; i < s + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
     }
}
   