class Solution {
    public int minElement(int[] nums) 
    {
        int s=0;
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            s=0;
            while(nums[i]!=0)
            {
            int r=nums[i]%10;
            s+=r;
            nums[i]/=10;
           }
           nums[i]=s;
    }
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]<m)
        {
            m=nums[i];
        }
    }
    
    return m;
}
}