class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int num:nums)
        {
            if(num>max)
            {
                max=num;
            }
            if(num<min)
            {
                min=num;
            }
        }
        int r=max-min+1;
        int ca[]=new int[r];
        for(int num:nums)
        {
            ca[num-min]++;
        }
        int ind=0;
        for(int i=0;i<r;i++)
        {
            while(ca[i]>0)
            {
              nums[ind]=i+min;
              ind++;
              ca[i]--;
            }
        }
        return nums;
    }
}