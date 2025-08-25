class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        int arr[]=new int[2];
       int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(al.contains(nums[i]))
            {
                arr[ind]=nums[i];
                ind++;
            }
            else
            {
                al.add(nums[i]);
            }
        }
        return arr;
    }
}