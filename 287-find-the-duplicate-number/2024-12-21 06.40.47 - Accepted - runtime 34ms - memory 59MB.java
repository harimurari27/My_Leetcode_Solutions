class Solution {
    public int findDuplicate(int[] nums) {
        /*int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        int slow2 = nums[0];

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow; */
       Arrays.sort(nums);
       int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
                {
                    a=nums[i];
                    break;
                }
        }
        return a;       
    }
}