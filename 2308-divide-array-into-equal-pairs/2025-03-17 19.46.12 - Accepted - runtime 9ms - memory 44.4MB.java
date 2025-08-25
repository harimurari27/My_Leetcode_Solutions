class Solution {
    public boolean divideArray(int[] nums)
     {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(hm.get(nums[i])%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}