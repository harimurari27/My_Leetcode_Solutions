class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                h.add(nums[i]);
            }
        }
        int a=0;
        for(int i=1;i<=n+1;i++)
        {
            if(!h.contains(i))
            {
                a=i;
                break;
            }
        }
        return a;
    }
}