class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        int n=nums.length;
       ArrayList<Integer> al=new ArrayList<>();
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         h.put(nums[i],h.getOrDefault(nums[i],0)+1);
       } 
       for(Map.Entry<Integer,Integer> e:h.entrySet())
       {
        if(e.getValue()>1)
        {
            al.add(e.getKey());
        }
       }
       return al;
    }
}