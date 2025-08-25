class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int t=0;
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
            int sum=nums[i]+nums[l]+nums[r];
            if(sum==t)
            {
                s.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
            }
            if(sum<t)
            {
                l++;
            }
            else if(sum>t)
            {
                r--;
            }
        }
        }
        li.addAll(s);
        return li;
    }
}