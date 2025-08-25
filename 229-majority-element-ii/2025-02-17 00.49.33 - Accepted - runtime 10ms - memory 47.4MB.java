class Solution {
    public List<Integer> majorityElement(int[] nums)
     {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        ArrayList<Integer> l=new ArrayList();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int k:m.keySet())
        {
            if(m.get(k)>n/3)
            {
                l.add(k);
            }
        }
        return l;
    }
}