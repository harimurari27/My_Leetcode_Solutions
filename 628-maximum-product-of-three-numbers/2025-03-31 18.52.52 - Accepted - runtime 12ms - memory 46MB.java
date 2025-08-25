class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int b=nums.length;
        int ans = Math.max(nums[b-1]*nums[b-2]*nums[b-3],nums[0]*nums[1]*nums[b-1]);
        return ans;
    }
}