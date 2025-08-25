class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        int m = 0;
        for (int num : freq.keySet()) {
            if (freq.containsKey(num + 1)) {
                int c = freq.get(num) + freq.get(num + 1);
                m= Math.max(m, c);
            }
        }

        return m;
    }
}