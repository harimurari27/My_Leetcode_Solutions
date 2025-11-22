class Solution {
    public boolean kLengthApart(int[] nums, int k) 
    {
        int n=nums.length;
        int p=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                if(p!=-1&&i-p-1<k)
                return false;
                p=i;
            }
        }
        return true;

    }
}