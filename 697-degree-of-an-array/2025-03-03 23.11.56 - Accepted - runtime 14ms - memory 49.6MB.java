class Solution {
    public int findShortestSubArray(int[] nums) {
        // The int is an array of [firstEncounter, lastEncounter, frequency]
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

       
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{i, i, 1});
            } 

            else {
                int[] arr = map.get(nums[i]);
                arr[1] = i;
                arr[2]++;
                map.put(nums[i], arr);
            }
        }
        int maxFreq = Integer.MIN_VALUE;
        int m= Integer.MAX_VALUE;
        for(int[] value : map.values()){
            if(value[2] > maxFreq){
                maxFreq = value[2];
                m = value[1] - value[0] + 1;
            } 
            else if(value[2] == maxFreq){
                m = Math.min(m, value[1] - value[0] + 1);
            }
        }
        return m;
    }
}