class Solution {
    public boolean checkPowersOfThree(int n) {
        String b=Integer.toString(n,3);
        return !b.contains("2");
    }
}