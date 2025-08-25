class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n=nums.length;
        int ind=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            if(h.get(nums[i])<=2)
            {
                nums[ind++]=nums[i];
            }
        }
        return ind;
    }
}