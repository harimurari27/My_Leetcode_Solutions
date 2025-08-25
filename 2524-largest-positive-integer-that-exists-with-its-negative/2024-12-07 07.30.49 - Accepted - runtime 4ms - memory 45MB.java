import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; 
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length && nums[i] < 0; i++) {
            int val = -nums[i];
            int index = search(nums, val);
            if (index >= 0) {
                return val; 
            }
        }

        return -1; 
    }

    private static int search(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                return m; 
            } else if (arr[m] < t) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1; 
    }
}