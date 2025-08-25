class Solution 
{
    public int sumOfGoodNumbers(int[] nums, int k) 
    {
        int s=0;
        int n=nums.length;
       for(int i=0;i<nums.length;i++)
           {
               boolean g=true;
               int a=i-k;
               int b=i+k;
             if(a>=0&&nums[i]<=nums[a])
             {
                 g=false;
             }
            if(b<n&&nums[i]<=nums[b])
            {
                g=false;
            }
               if(g)
               {
                   s+=nums[i];
               }
           }
        
        return s;
    }
}