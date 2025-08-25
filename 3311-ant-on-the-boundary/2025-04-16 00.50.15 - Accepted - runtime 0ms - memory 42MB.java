class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n=nums.length;
        int s=0,c=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            if(s==0)
            {
                c++;
            }
        }
        return c;
        
    }
}