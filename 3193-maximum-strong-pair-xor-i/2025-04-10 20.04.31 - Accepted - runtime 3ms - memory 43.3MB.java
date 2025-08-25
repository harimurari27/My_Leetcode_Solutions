
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(nums[i]-nums[j])<= Math.min(nums[i],nums[j]))
                {
                int sum= nums[i]^nums[j];
                max=Math.max(sum,max);
                }
            }
        }return max;
    }
}