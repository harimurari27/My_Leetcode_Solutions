class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int validSelections = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (canMakeAllZeros(nums.clone(), i, -1)) {
                    validSelections++;
                }
                if (canMakeAllZeros(nums.clone(), i, 1)) {
                    validSelections++;
                }
            }
        }

        return validSelections;
    }

    private boolean canMakeAllZeros(int[] nums, int curr, int direction) {
        int n = nums.length;

        while (curr >= 0 && curr < n) {
            if (nums[curr] == 0) {
                curr += direction;
            } else if (nums[curr] > 0) {
                nums[curr]--;
                direction *= -1;
                curr += direction;
            }
        }

        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
