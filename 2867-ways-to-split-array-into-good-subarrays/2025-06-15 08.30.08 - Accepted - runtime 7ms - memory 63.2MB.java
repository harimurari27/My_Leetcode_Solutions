class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        int c = 0;
        long a = 1;
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (f == 1)
                    c++;
            } else {
                if (f == 0) {
                    f = 1;
                    c++;
                } else {
                    a = (a * c) % 1000000007;
                    c = 1;
                }
            }
        }
        if (c == 0) return 0;
        return (int) a;
    }
}
