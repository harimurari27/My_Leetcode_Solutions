class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int l=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i+=3)
        {
            if(nums[i]!=nums[i+1])
            {
                
               l =nums[i];
               break;
            }
        }
        return l;
    }
}