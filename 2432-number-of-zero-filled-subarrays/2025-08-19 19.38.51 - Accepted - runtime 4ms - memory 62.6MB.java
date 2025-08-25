class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
       long s=0,a=0;
       for(int i:nums)
       {
         if(i==0)
         {
            s++;
            a+=s;
         }
         else
         {
            s=0;
         }
       }
       return a;
    }
}