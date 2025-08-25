class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
        {
            h.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {
                al.add(i);
            }
        }
        return al;
    }
}