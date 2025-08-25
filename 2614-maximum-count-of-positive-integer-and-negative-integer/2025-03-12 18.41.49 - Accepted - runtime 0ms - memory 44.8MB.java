class Solution {
    public int maximumCount(int[] nums) 
    {
        int n=nums.length;
        /*int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>0){
                high=mid-1;
            }
            else if()
        }*/
        int p=0;
        int ne=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                p++;
            }
            else if(nums[i]<0)
            {
                ne++;
            }
        }
        int a=Math.max(p,ne);
        return a;
        
    }
}