class Solution {
    public int minOperations(int[] nums, int k) 
    {
        int n=nums.length;
        int ct=count(nums,k);
        HashSet<Integer> hanss=new HashSet<>();
        if(ct==0){
            for(int i=0;i<n;i++){
                if(nums[i] != k)
                hanss.add(nums[i]);
            }
        }
        else{
            return -1;
        }
        return hanss.size();
    }
    int count(int a[],int k){
        int ct=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<k)
                ct++;
        }
        return ct;
    }
}