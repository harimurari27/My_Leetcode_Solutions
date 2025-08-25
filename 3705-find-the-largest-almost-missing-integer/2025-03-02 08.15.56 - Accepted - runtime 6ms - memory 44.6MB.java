import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                s.add(nums[j]);
            }
            for (int num : s) {
                h.put(num,h.getOrDefault(num, 0) + 1);
            }
        }
        int a= -1;
        for (int num :h.keySet()) {
            if (h.get(num) == 1) {
                a = Math.max(a, num);
            }
        }    
        return a;
    }
}
