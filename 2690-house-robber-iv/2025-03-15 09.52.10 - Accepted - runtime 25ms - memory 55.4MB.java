class Solution {
    private boolean canStealKHouses(int[] nums, int k, int capability) {
        int c = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= capability) {
                c++;
                i += 2;
            } else {
                i++;
            }
        }
        return c>= k;
    }
    public int minCapability(int[] nums, int k) {
        int left = Arrays.stream(nums).min().getAsInt();
        int right = Arrays.stream(nums).max().getAsInt(); 
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canStealKHouses(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }   
        return left;
    }
}