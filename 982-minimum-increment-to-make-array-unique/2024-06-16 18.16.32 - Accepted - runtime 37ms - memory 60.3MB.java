class Solution {
    public int minIncrementForUnique(int[] nums)
    {
      Arrays.sort(nums);
      int r=0;
      for(int i=1;i<nums.length;i++)
      {
        int previous=nums[i-1];
        int current=nums[i];
        if(previous>=current)
        {
            r=r+(previous-current)+1;
            nums[i]=previous+1;
        }
      } 
       return r; 
    }
}