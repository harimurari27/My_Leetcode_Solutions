class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n = nums.length;
        int count = 0;
        int i = 0;
        while (i < n) {
            int maxVal = nums[i];
            int j = i + 1;
            while (j < n && nums[j] < maxVal) {
                maxVal = Math.max(maxVal, nums[j]);
                j++;
            }
            count++; 
            i = j;   
        }
        return count;
    }
}
