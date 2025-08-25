class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n=nums.length;
        int arr[]=new int[n];
        int l=0,r=n-1;
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            if(nums[i]<pivot)
            {
                arr[l]=nums[i];
                l++;
            }
            if(nums[j]>pivot)
            {
                arr[r]=nums[j];
                r--;
            }
        }
        while(l<=r)
        {
            arr[l]=pivot;
            l++;
        }
       return arr;
    }
}