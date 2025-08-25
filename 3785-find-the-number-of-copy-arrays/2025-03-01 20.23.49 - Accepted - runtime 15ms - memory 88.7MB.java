class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = bounds[i][0];
            arr[i][1] = bounds[i][1];
        }
        
        for (int i = 1; i < n; i++) {
            int diff = original[i] - original[i - 1];
            int n1 = arr[i - 1][0] + diff;
            int n2 = arr[i - 1][1] + diff;
            arr[i][0] = Math.max(arr[i][0], n1);
            arr[i][1] = Math.min(arr[i][1], n2);
            if (arr[i][0] > arr[i][1]) {
                return 0;
            }
        }
        
        return arr[n - 1][1] - arr[n - 1][0] + 1;
    }
}
