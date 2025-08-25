class Solution
 {
    public int search(int[] nums, int target) 
    {
        int n=nums.length;
        int in=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                in=i;
                return in;
            }
        }
        return -1;
        
    }
}