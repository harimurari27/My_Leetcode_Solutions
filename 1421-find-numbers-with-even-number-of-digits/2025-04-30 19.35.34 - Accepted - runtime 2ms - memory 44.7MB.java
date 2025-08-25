class Solution {
    public int findNumbers(int[] nums) 
    {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            String s=Integer.toString(nums[i]);
            if(s.length()%2==0)
            {
                c++;
            }
        }
        return c;
    }
}