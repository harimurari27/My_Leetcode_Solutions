class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
     {
        int n=nums.length;
        int c=0,mc=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                c=0;
            }
            else
            {
                c++;
                if(mc<c)
                {
                    mc=c;
                }
            }
        }
        return mc;
    }
}