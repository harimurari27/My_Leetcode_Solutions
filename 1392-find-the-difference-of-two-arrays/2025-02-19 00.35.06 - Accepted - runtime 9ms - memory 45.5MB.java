import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int n : nums1) h1.add(n);
        for (int n : nums2) h2.add(n);
        for (int n : nums2) {
            if (h1.contains(n)) {
                h1.remove(n);
                h2.remove(n);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(h1)); // Unique to nums1
        result.add(new ArrayList<>(h2)); // Unique to nums2
        
        return result;
    }
}