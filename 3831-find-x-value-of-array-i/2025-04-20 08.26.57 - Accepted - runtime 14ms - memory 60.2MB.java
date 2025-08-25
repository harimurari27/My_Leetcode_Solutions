class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] r = new long[k];
        long[] arr = new long[k];
        for (int i = 0; i < n; i++) {
            long[] nrr = new long[k];
            int mod = nums[i] % k;
            nrr[mod]++;
            r[mod]++;
            for (int j = 0; j < k; j++) {
                if (arr[j] > 0) {
                    int nm = (int)((j * 1L * nums[i]) % k);
                    nrr[nm] += arr[j];
                    r[nm] += arr[j];
                }
            }
            arr = nrr;
        }
        return r;
    }
}
