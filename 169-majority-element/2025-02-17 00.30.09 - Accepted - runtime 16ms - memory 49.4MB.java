class Solution {
    public int majorityElement(int[] nums)
    {
      HashMap<Integer,Integer> m=new HashMap<>();
      int n=nums.length;
      for(int i=0;i<n;i++)
      {
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        if(m.get(nums[i])>n/2)
        {
            return nums[i];
        }
      }
      return -1;
    }
}