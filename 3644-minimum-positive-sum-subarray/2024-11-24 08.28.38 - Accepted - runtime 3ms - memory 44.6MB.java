class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;
        for (int size = l; size <= r; size++) {
            int currentSum = 0;
            for (int i = 0; i < size; i++) {
                currentSum += nums.get(i);
            }
            if (currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
                found = true;
            }
            for (int i = size; i < n; i++) {
                currentSum += nums.get(i) - nums.get(i - size);

                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                    found = true;
                }
            }
        }
        return found ? minSum : -1;
    }
}