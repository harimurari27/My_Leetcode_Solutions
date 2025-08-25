class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = 0;
        for (int candy : candies) {
            m = Math.max(m, candy);
        }    
        List<Boolean> result = new ArrayList<>();    
        for (int candy : candies) {
            if (candy + extraCandies >= m) {
                result.add(true);
            } else {
                result.add(false);
            }
        }   
        return result;
    }
}