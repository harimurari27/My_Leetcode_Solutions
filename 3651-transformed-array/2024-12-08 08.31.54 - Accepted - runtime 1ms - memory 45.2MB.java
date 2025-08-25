class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] resul = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                resul[i] = nums[i];
            } else {
                
                int newIndex = (i + nums[i]) % n;
                if (newIndex < 0) {
                    newIndex += n; 
                }
                resul[i] = nums[newIndex];
            }
        }

        return resul;
    }
}
