class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-2;i++){
            int cur = nums[i];
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                int sum = nums[s]+nums[e];    
                if(Math.abs(target-(sum+cur))<diff){
                    diff = Math.abs(target-(sum+cur));
                    ans = sum+cur;
                }
                if(sum>target-cur){
                    e--;
                }else{
                    s++;
                }               
            }
        }
        return ans;
    }
}