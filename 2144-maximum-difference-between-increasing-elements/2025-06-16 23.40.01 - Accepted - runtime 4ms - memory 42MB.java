class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        int a=-1;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                    a=Math.max(a,nums[j]-nums[i]);
                }
            }
        }
        return a;
    }
}