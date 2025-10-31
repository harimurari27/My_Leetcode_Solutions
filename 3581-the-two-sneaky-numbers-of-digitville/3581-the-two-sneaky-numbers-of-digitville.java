class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int id=0;
        for(int i:hm.keySet())
        {
           if(hm.get(i)>1)
            {
                arr[id]=i;
                id++;
            }
        }
        return arr;
    }
}