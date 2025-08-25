import java.util.HashSet;

class Solution {
    public int minimumOperations(int[] nums) {
        int operat = 0;
        
        while (true) {
            HashSet<Integer> seen = new HashSet<>();
            boolean allDistinct = true;
            for (int num : nums) {
                if (!seen.add(num)) {  
                    allDistinct = false;
                    break;
                }
            }
            if (allDistinct) {
                break;
            }
            if (nums.length >= 3) {
                int[] newArray = new int[nums.length - 3];
                System.arraycopy(nums, 3, newArray, 0, newArray.length);
                nums = newArray;
            } else {
                nums = new int[0]; 
            }
            
            operat++;
        }
        
        return operat;
    }
}
