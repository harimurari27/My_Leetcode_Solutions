class Solution {
    public boolean containsDuplicate(int[] nums)
     {
        HashSet<Integer> h=new HashSet<>();
        int n=nums.length;
        for(int k:nums)
        {
            if(h.contains(k))
            {
                return true;
            }
            h.add(k);
        }
        return false;
    }
}