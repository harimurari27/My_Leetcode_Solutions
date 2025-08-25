class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int c=target-nums[i];
            if(hm.containsKey(c))
            {
                return new int[] {hm.get(c),i};
            }
            hm.put(nums[i],i);
        }
      return new int[] {-1,-1};
    }
}