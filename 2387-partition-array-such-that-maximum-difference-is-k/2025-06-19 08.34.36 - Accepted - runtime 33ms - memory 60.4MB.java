class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        int count=0;
        while(s<nums.length)
        {
            int min=nums[s];
            while(s<nums.length&&nums[s]-min<=k)
            {
                s++;
            }          
            count++;
        }
        return count;
    }
}