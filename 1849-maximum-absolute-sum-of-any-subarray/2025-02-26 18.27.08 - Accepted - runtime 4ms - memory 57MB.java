class Solution {
    public int maxAbsoluteSum(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int c1=0,c2=0;
        for(int i:nums)
        {
            c1+=i;
            c2+=i;
            max=Math.max(c1,max);
            min=Math.min(c2,min);
            if(c1<0) c1=0;
            if(c2>0) c2=0;
        }
        min=Math.abs(min);
        return Math.max(min,max);
    }
}