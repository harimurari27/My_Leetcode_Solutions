class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int v=nums[i];
            if(h.containsKey(v)&&i-h.get(v)<=k)
            {
                return true;
            }
            h.put(v,i);
        }
        return false;
    }
}