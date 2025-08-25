class Solution {
    public int[] twoSum(int[] numbers, int target)
     {
        int n=numbers.length;
        int ind[]=new int[2];
        int l=0,r=n-1;
        while(l<=r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                ind[0]=l+1;
                ind[1]=r+1;
                break;
            }
            else if(numbers[l]+numbers[r]>target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return ind;
    }
}