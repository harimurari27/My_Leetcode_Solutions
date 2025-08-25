import java.util.*;

class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n];
        Arrays.fill(arr, Integer.MAX_VALUE);
        int minCost = cost[0];
        arr[0] = minCost;
        for (int i = 1; i < n; i++) {
            minCost = Math.min(minCost, cost[i]);
            arr[i] = minCost;
        } 
        return arr;
    }
}
