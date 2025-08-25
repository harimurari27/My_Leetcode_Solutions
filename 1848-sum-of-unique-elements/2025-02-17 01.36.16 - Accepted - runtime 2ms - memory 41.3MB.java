class Solution {
    public int sumOfUnique(int[] nums)
     {

        int s=0;
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()==1)
            {
                s+=e.getKey();
            }
        }
        return s;
    
     }
}