class Solution 
{
    public int maxAdjacentDistance(int[] nums) 
    {
        int n=nums.length;
        int m=0;
        for(int i=0;i<n-1;i++)
        {
           m=Math.max(m,Math.abs(nums[i+1]-nums[i]));
           m=Math.max(m,Math.abs(nums[n-1]-nums[0]));
        }
        return m;
    }
}